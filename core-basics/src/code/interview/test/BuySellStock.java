package code.interview.test;

/* Buy and Sell Stock where profit should come maximum so here we have an array 
 * ith element is price of stock and i is day.
 * 
 * Ex: {7,1,5,4,6,3}, profit = 6 - 1 = 5 but not 7 - 1 = 6
 * 
 * output: 5
 * 
 * */
public class BuySellStock {

	public static int buySellStock(int[] stockPrices) {
		
		//if array having single element
		if(stockPrices.length < 2)
			return 0;
		
		int minPrice = stockPrices[0];
		int maxProfit = 0;
		for(int i = 1; i < stockPrices.length; i++) {
			maxProfit = Math.max(maxProfit, stockPrices[i] - minPrice);
			minPrice = Math.min(minPrice, stockPrices[i]);
		}
		
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] stockPrices = {7,1,5,4,6,3}; // different input: {7,1,5,4,6,3} -> 5, {4} -> 0, {5,4,3,2,1} -> 0
		int mProfit = buySellStock(stockPrices);
		System.out.println("Max Profit: " + mProfit);
	}

}
