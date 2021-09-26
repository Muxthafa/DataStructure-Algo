package com.bridgelabz.ds;

import java.util.Stack;

public class BalancedParanthesis {
	
	 Stack<Character> stack = new Stack<Character>();

	/**
	 * @method to check if an expression is balanced or not
	 * @param expr
	 */
	public void isBalanced(String expr) {

		for (int i = 0; i < expr.length(); i++) {
			if (expr.charAt(i) == '(' || expr.charAt(i) == '{' || expr.charAt(i) == '[') {

				stack.push(expr.charAt(i));			//push to the stack in the presence of open braces

			} else if (expr.charAt(i) == ')' || expr.charAt(i) == '}' || expr.charAt(i) == ']') {

				stack.pop();						//push to the stack in the presence of closing braces

			}
		}

		if (stack.isEmpty()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

	public static void main(String[] args) {
		BalancedParanthesis balanced = new BalancedParanthesis();
		String expr1 = "([{}])";
		String expr2 = "(5+6)*(7+8)/(4+3";
		balanced.isBalanced(expr1);
		balanced.isBalanced(expr2);
	}
}
