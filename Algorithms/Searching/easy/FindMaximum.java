package Algorithms.Searching.easy;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array of integers which is initially increasing and then decreasing, find the maximum value in the array.
Examples :

Input: arr[] = {8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1}
Output: 500
Input: arr[] = {1, 3, 50, 10, 9, 7, 6}
Output: 50
Corner case (No decreasing part)
Input: arr[] = {10, 20, 30, 40, 50}
Output: 50
Corner case (No increasing part)
Input: arr[] = {120, 100, 80, 20, 0}
Output: 120
 */
public class FindMaximum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Maximum value in the array: " + findMaximum(arr));

        scanner.close();
    }
    static int findMaximum(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

}
