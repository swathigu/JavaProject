/*
 *  Write a program to check if a given string of parenthesis has balanced parenthesis or not.
 *  For example a string as "(())" is a valid string where as strings like
 *   ")(" or "(()))" are not valid strings.
 */
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;


public class BalancedParanthesis {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = in.nextLine();
		System.out.println("String validity is "+ isValid(str));
	}

	public static boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	 
		Stack<Character> stack = new Stack<Character>();
	 
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
	 
			if (map.keySet().contains(curr)) {
				System.out.println("if");
				stack.push(curr);
			} else if (map.values().contains(curr)) {
				System.out.println("elseif");
				if (!stack.empty() && map.get(stack.peek()) == curr) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
	 
		return stack.empty();
	}
}
