package com.datastructure.linkedList;


public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public void add(T element) {
        Node<T> l = last;
        Node<T> newNode = new Node<>(l, element);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
    }

    public void remove(T element) {
        Node<T> currentNode = first;
        Node<T> oldNode = first;
        while (currentNode != null) {
            if (currentNode.element == element) {
                if (currentNode.prev == null) {
                    first = currentNode.next;
                    first.prev = null;
                } else if (currentNode.next == null) {
                    oldNode.next = null;
                } else {
                    currentNode = currentNode.next;
                    oldNode.next = currentNode;
                    currentNode.prev = oldNode;
                }
                currentNode = null; // help GC
                return;
            }
            oldNode = currentNode;
            currentNode = currentNode.next;
        }
        System.out.printf("%s not found.%n", element);
    }

    public void print() {
        Node<T> currentNode = first;
        if (currentNode == null) {
            System.out.print("empty list.");
            return;
        }
        while (currentNode != null) {
            System.out.println("########");
            System.out.println("element: " + currentNode.element);
            if (currentNode.next == null) {
                System.out.println("next: null" +
                        "\nprev: " + currentNode.prev.element);
                break;
            }
            if (currentNode.prev == null) {
                System.out.println("prev: null" +
                        "\nnext: " + currentNode.next.element);
                currentNode = currentNode.next;
                continue;
            }

            System.out.println("prev: " + currentNode.prev.element);
            System.out.println("next: " + currentNode.next.element);
            currentNode = currentNode.next;
        }
    }

    private static class Node<T> {
        T element;
        Node<T> next;
        Node<T> prev;

        public Node(Node<T> prev, T element) {
            this.element = element;
            next = null;
            this.prev = prev;
        }
    }
}
