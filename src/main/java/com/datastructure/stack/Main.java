package com.datastructure.stack;

public class Main {
    public static void main(String[] args) {
        var stack = new Stack<>();
        stack.push("teste 1");
        stack.push("teste 2");
        stack.push("teste 3");
        stack.push("teste 4");
        stack.print();
        System.out.println("##### REMOVENDO");
        stack.pop();
        stack.print();

        System.out.println("##### STACK PRIMITIVE");
        var stackPrimitive = new StackPrimitive(4);
        stackPrimitive.push("teste 1");
        stackPrimitive.push("teste 2");
        stackPrimitive.push("teste 3");
        stackPrimitive.push("teste 4");
        stackPrimitive.print();
        System.out.println("##### REMOVENDO");
        stackPrimitive.pop();
        stackPrimitive.print();
    }
}
