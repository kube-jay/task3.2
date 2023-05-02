package ru.vsu.cs.aisd2023.task3;

import java.util.Stack;

public class Solution {
    public void mySolve(Queue queue) {
        //loop through the queue,
        // dequeue and check if value is even add it to stack
        // otherwise ignore
        // when the queue is empty, populate the queue with value from stack
        int length = queue.getSize();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            int data = queue.dequeue();
            if (checkEven(data)) {
                stack.push(data);
            }
        }

        int stackLength = stack.size();
        for (int i = 0; i < stackLength; i++) {
            int data = stack.pop();
            queue.enqueue(data);
        }
    }

    public void javaSolve(java.util.Queue<Integer> queue) {
        int length = queue.size();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            int data = queue.remove();
            if (checkEven(data)) {
                stack.push(data);
            }
        }

        int stackLength = stack.size();
        for (int i = 0; i < stackLength; i++) {
            int data = stack.pop();
            queue.add(data);
        }
    }

    private boolean checkEven(int num) {
        return num % 2 == 0;
    }
}

