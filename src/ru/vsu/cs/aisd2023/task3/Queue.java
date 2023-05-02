package ru.vsu.cs.aisd2023.task3;

import java.util.NoSuchElementException;

public class Queue {
    private Node<Integer> head;
    private Node<Integer> tail;
    private int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        Node<Integer> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;

        size++;
    }

    public int dequeue() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int data = head.getData();
        head = head.getNext();
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return data;
    }

    public int peek() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return head.getData();
    }
}

