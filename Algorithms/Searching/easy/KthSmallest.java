package Algorithms.Searching.easy;

import java.util.Arrays;
import java.util.Scanner;
/*
Given an n x n matrix, where every row and column is sorted in non-decreasing order.
Find the kth smallest element in the given 2D array.

Example,

Input:k = 3 and array =
        10, 20, 30, 40
        15, 25, 35, 45
        24, 29, 37, 48
        32, 33, 39, 50
Output: 20
Explanation: The 3rd smallest element is 20
Input:k = 7 and array =
        10, 20, 30, 40
        15, 25, 35, 45
        24, 29, 37, 48
        32, 33, 39, 50
Output: 30
Explanation: The 7th smallest element is 30

 */
public class KthSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        input.nextLine();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                arr[i][j] = input.nextInt();
            }
        }
        kthSmallest(arr, K);
    }

    public static void kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] flattenedArray = new int[n * n];

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                flattenedArray[index++] = matrix[i][j];
            }
        }


        Arrays.sort(flattenedArray);


        System.out.println("The " + k +"th smallest element is " + flattenedArray[k - 1]);
    }
}
