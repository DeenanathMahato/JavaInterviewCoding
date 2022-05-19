package com.rest.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import netscape.javascript.JSObject;

//To check this turn off zscaler
public class NetClientGet {

	public static final String FREE_URI1 = "https://covid19.mathdro.id/api";
	public static final String FREE_URI2 = "https://jsonplaceholder.typicode.com/todos/1";

	public static void main(String[] args) {
		try {

			URL url = new URL(FREE_URI2);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			String msg = new String();
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				msg += output;
			}
			
			System.out.println(msg);

			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
