package com.learning.stack;

import java.util.Stack;

/**
 * Created by vperiasamy on 2/12/17.
 */
import java.util.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {
    static Stack stack = new Stack();

    // {[()]}
    // {[(])}
    // {{[[(())]]}}
    public static boolean isBalanced(String expression) {
        for (char c: expression.toCharArray()) {
            if (!stack.isEmpty() && isMatch((Character) stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        stack.clear();
        return false;
    }

    private static boolean isMatch(Character peek, char c) {
        if (peek == '{' && c == '}') return true;
        else if (peek == '[' && c == ']') return true;
        else if (peek == '(' && c == ')') return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if (t < 1 || t > 1000) return;
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            if (null == expression || expression.length() < 1 ||  expression.length() > 1000) return;
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

