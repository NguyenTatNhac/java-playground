package com.ntnguyen.leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation150Solution1 {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isInt(token)) {
                stack.push(Integer.parseInt(token));
            } else /* It is an operator */ {
                int number2 = stack.pop();
                int number1 = stack.pop();
                int result = applyOperator(number1, number2, token);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    private boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
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
