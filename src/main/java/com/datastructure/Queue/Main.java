package com.datastructure.Queue;

public class Main {
    public static void main(String[] args) {

        var queue = new Queue(5);
        queue.enqueue("test 1");
        queue.enqueue("test 2");
        queue.enqueue("test 3");
        queue.enqueue("test 4");
        queue.enqueue("test 5");
        queue.queueFront();
        queue.dequeue();
        queue.dequeue();

        System.out.println("### REMOVENDO");
        queue.queueFront();
    }
}
