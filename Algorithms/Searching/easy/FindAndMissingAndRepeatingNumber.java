package Algorithms.Searching.easy;

import java.util.Scanner;
/*
Given an unsorted array of size n. Array elements are in the range of 1 to n.
One number from set {1, 2, …n} is missing and one number occurs twice in the array.
Find these two numbers.

Examples:

Input: arr[] = {3, 1, 3}
Output: Missing = 2, Repeating = 3
Explanation: In the array, 2 is missing and 3 occurs twice

Input: arr[] = {4, 3, 6, 2, 1, 1}
Output: Missing = 5, Repeating = 1


 */

public class FindAndMissingAndRepeatingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        input.nextLine();
        for (int i = 0; i < N; i++){
            arr[i] = input.nextInt();
        }
        findMissingAndRepeatNumber(arr, N);
    }

    private static void findMissingAndRepeatNumber(int[] arr, int n) {
        int[] missingArr = new int[n + 1];
        int missingNumber = -1; // Default olarak -1 olarak ayarlandı
        int repeatingNumber = -1; // Default olarak -1 olarak ayarlandı
        for (int i = 0; i < n; i++){
            missingArr[i] = arr[i];
        }
        for (int i = 1; i <= n; i++){
            boolean flag = false;
            for (int k : arr) {
                if (i == k) {
                    flag = true;
                }
            }
            if (!flag){
                missingNumber = i;
                break; // Döngüden çık
            }
        }

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    repeatingNumber = arr[i];
                    break; // Döngüden çık
                }
            }
            if (repeatingNumber != -1) {
                break; // Döngüden çık
            }
        }
        System.out.printf("Missing = %d, Repeating = %d%n", missingNumber, repeatingNumber);
    }
}
