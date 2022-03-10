package com.ds.Ankit_Pathak;

import java.util.Stack;

public class Balanced_Brackets_Hackerrank {

	public static String isBalanced(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (char ch : s.toCharArray()) {
			if (ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
			} else {
				if (ch == ']')
					ch = '[';
				else if (ch == '}')
					ch = '{';
				else if (ch == ')')
					ch = '(';

				if (stack.isEmpty() || stack.peek() != ch)
					return "NO";

				stack.pop();
			}
		}
		return (stack.isEmpty()) ? "YES" : "NO";
	}

}
