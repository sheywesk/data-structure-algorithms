package com.datastructure.Queue;

public class Queue {
    private int rear;
    private final int capacity;
    private Object[] queue;

    public Queue(int size) {
        this.rear = 0;
        this.capacity = size;
        this.queue = new Object[capacity];
    }

    public void enqueue(Object obj) {
        if (rear == capacity) {
            System.out.println("Queue is full");
            return;
        }


        queue[rear++] = obj;
    }

    public void dequeue() {
        if (rear == 0) {
            System.out.println("Queue is empty");
            return;
        }
        for (var i = 0; i < capacity-1; i++) {
            queue[i] = queue[i + 1];
        }
        queue[rear-1] = null;
        --rear;
    }

    public void queueFront() {
        for (var element : queue) {
            System.out.println(element);
        }
    }
}
