package ru.vsu.cs.aisd2023.task3;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
//        int Saved [] = new int[]{3,5,7,6,5,8,7,2,4,9,4};
        System.out.print("Enter the number of integers to add to the queue: ");
        int numIntegers = scanner.nextInt();
//        int numIntegers = Saved.length;
        java.util.Queue<Integer> javaQueue = new LinkedList<>();
        Queue queue = new Queue();
        for (int i = 0; i < numIntegers; i++) {
            System.out.print("Enter an integer to add to the queue: ");
            int data = scanner.nextInt();
//            int data = Saved[i];
            queue.enqueue(data);
            javaQueue.add(data);
        }

        solution.javaSolve(javaQueue);
        solution.mySolve(queue);

        System.out.println("Remaining integers in the queue: ");
        int[] myOutputArray = new int[queue.getSize()];
        int i = 0;
        while (!queue.isEmpty()) {
            myOutputArray[i++] = queue.dequeue();
        }
        for (i = myOutputArray.length - 1; i >= 0; i--) {
            System.out.println(myOutputArray[i]);
        }

        System.out.println("Remaining integers in the queue: ");
        i = 0;
        while (!javaQueue.isEmpty()) {
            myOutputArray[i++] = javaQueue.remove();
        }
        for (i = myOutputArray.length - 1; i >= 0; i--) {
            System.out.println(myOutputArray[i]);
        }

        scanner.close();
    }
}


