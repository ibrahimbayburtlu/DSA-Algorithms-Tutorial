package Algorithms.Recursion.implementation;

import java.util.Scanner;

public class Hanoi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int diskCount = input.nextInt();
        String source = "A", auxiliary = "B", destination = "C";
        System.out.println("Number of disks: " + diskCount);
        System.out.println("Steps to solve the Hanoi Towers Problem:");
        solveHanoi(diskCount, source, auxiliary, destination);
    }


    // Solution to the Hanoi Towers Problem
    public static void solveHanoi(int diskCount, String source, String auxiliary, String destination) {
        if (diskCount == 1) {
            System.out.println(source + " --> " + destination);
        } else {
            // Move diskCount - 1 disks to the auxiliary tower
            solveHanoi(diskCount - 1, source, destination, auxiliary);
            // Move the largest disk from source to destination
            System.out.println(source + " --> " + destination);
            // Move disks from auxiliary to destination
            solveHanoi(diskCount - 1, auxiliary, source, destination);
        }
    }
}
