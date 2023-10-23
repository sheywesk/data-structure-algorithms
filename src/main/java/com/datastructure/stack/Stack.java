package com.datastructure.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {
    private final List<T> elements;

    public Stack(int size) {
        this.elements = new ArrayList<>(size);
    }

    public Stack() {
        this.elements = new ArrayList<>();
    }

    public void push(T element) {
        elements.add(element);
    }

    public void pop() {
        elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public T peek() {
        return elements.get(elements.size() - 1);
    }

    public void print() {
        elements.forEach(System.out::println);
    }
}

class StackPrimitive {
    private Object[] elements;
    private int top;

    public StackPrimitive(int size) {
        this.elements = new Object[size];
        this.top = -1;
    }

    public void push(Object element) {
        if (elements.length - 1 == top) {
            throw new StackOverflowError();
        }
        elements[++top] = element;
    }

    public Object pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        var obj = elements[top];
        elements[top] = null; //help GC
        top--;
        return obj;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public Object peek() {
        return elements[top];
    }

    public void print() {
        for (var item : elements) {
            if(item == null) return;
            System.out.println("item: " + item);
        }
    }
}
