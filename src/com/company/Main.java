package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);                                         // Methode push
        stack.push(4);
        stack.push(9);

        System.out.println("Oberstes Element: " + stack.peek());    // Methode peek

        stack.pop();                                                // Methode pop
        stack.pop();

        System.out.println("Der Stack hat " + stack.size() + " Element(e)");  // Methode size

        System.out.println(stack.empty() ? "Stack ist leer" : "Stack ist gefüllt"); // Methode empty
    }
}
