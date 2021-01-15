package com.company;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean checkBalancedBrackets(String expr) {
        Stack<Character> stack = new Stack<>();

        // Traverse the expression
        for(int i=0; i<expr.length(); i++) {
            // Check for each character
            char x = expr.charAt(i);

            // Push all the opening brackets
            if(x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            // check if the stack is empty or not
            if(stack.isEmpty())
                return false;

            char check;
            switch(x) {
                case ')':
                    check = stack.pop();
                    if(check == '[' || check == '{')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if(check == '(' || check == '{')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '[')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String expr = sc.next();

        System.out.println("the expression is: " + expr);
        System.out.println();

        if(checkBalancedBrackets(expr))
            System.out.println("Expression is BALANCED!");
        else
            System.out.println("Expression is NOT BALANCED!");
    }
}
