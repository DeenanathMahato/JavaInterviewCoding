package code.interview.test;

import java.util.Stack;

public class FindValidPairs {

	//it is recommended one using stack TC:o(n)
	public static int countValidPair(String inputStr) {
		//create stack to insert only open braces and to check top element
		Stack<Character> stack = new Stack<>();
		int count = 0;
		for(int i = 0; i < inputStr.length(); i++) {
			char cr = inputStr.charAt(i);
			//check opening braces
			if(cr == '{') {
				stack.push(cr);
			} else {
				//check valid closing braces
				if(!stack.isEmpty() && stack.peek() == '{' && cr == '}') {
					count += 1;
					stack.pop();
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		String inputStr = "}{}{"; // "{hello{deenu}hey}" -> 2, "}{}{" -> 1
		int count = countValidPair(inputStr);
		System.out.println(count);
	}
}
