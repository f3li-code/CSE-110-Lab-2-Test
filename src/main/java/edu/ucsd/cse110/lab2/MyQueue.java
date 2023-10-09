package edu.ucsd.cse110.lab2;

public class MyQueue {
    private int[] elements;
    private int front; // the first valid element's index, queue's head
    private int rear; // the first position to insert a new element
    private int size;
    
    public MyQueue(int capacity) {
        elements = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == elements.length;
    }
    
    public int size() {
        return size;
    }
    
    public void enqueue(int element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }
    
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int element = elements[front];
        front = (front + 1) % elements.length;
        size--;
        return element;
    }
    
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }
}