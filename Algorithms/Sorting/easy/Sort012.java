package Algorithms.Sorting.easy;

import java.util.Arrays;
import java.util.Scanner;
/*
Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array.
The functions should put all 0s first, then all 1s and all 2s in last.

Examples:
Input: {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}

Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
 */
public class Sort012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Dizinin uzunluğunu girin: ");
        int length = scanner.nextInt();


        int[] arr = new int[length];
        System.out.println("Dizi elemanlarını girin (0, 1 veya 2):");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        sortColors(arr);

        System.out.println("Sıralanmış dizi: " + Arrays.toString(arr));
    }

    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
