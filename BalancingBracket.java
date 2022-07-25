package com.java.assignment3;
import java.util.Stack;

public class BalancingBracket {
	static boolean checkingBracketBalancing(String bracketExpression) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < bracketExpression.length(); i++)
		{
			char x = bracketExpression.charAt(i);
			if (x == '(' || x == '[' || x == '{')
			{
				stack.push(x);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;
			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;
			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;		
			}
		}
		return (stack.isEmpty());
	}
    public static void main(String[] args) {
    	String bracketExpression = "([{}])";
    	Boolean result;
    	result = checkingBracketBalancing(bracketExpression);
    	if (result)
    		System.out.println("The entered string has balanced brackets");
    		else
    			System.out.println("The entered string do not have balanced brackets");
    			
    }
}
