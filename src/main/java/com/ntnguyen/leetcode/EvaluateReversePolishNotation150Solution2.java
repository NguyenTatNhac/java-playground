package com.ntnguyen.leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation150Solution2 {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int number2 = stack.pop();
                int number1 = stack.pop();
                int result = applyOperator(number1, number2, token);
                stack.push(result);
            } else /* It is an operator */ {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    private int applyOperator(int number1, int number2, String operator) {
        return switch (operator) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            case "/" -> number1 / number2;
            default -> throw new RuntimeException("Not an operator");
        };
    }
}
