/**
You are given an array of strings tokens that represents a valid arithmetic expression in Reverse Polish Notation.

Return the integer that represents the evaluation of the expression.

The operands may be integers or the results of other operations.
The operators include '+', '-', '*', and '/'.
Assume that division between integers always truncates toward zero.

Example 1:
Input: tokens = ["1","2","+","3","*","4","-"]
Output: 5
Explanation: ((1 + 2) * 3) - 4 = 5
 */

import java.util.Stack;

class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();

        for(String token : tokens) {
            if("+-*/".contains(token) && !stack.isEmpty()) {
                int opr = stack.pop();
                int opl = stack.pop();

                switch(token) {
                    case "+": 
                        stack.push(opl + opr);
                        break;
                    case "-": 
                        stack.push(opl - opr);
                        break;
                    case "/": 
                        stack.push(opl / opr);
                        break;
                    case "*": 
                        stack.push(opl * opr);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        reversePolishNotation rpn = new reversePolishNotation();
        String[] tokens = {"1","2","+","3","*","4","-"};
        System.out.println(rpn.evalRPN(tokens));
    }
}
