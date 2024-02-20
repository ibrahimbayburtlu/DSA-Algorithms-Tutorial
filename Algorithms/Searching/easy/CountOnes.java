package Algorithms.Searching.easy;

import java.util.Scanner;

/*
Given a binary array arr[] of size N, which is sorted in non-increasing order,
count the number of 1’s in it.
Examples:

Input: arr[] = {1, 1, 0, 0, 0, 0, 0}
Output: 2

Input: arr[] = {1, 1, 1, 1, 1, 1, 1}
Output: 7

Input: arr[] = {0, 0, 0, 0, 0, 0, 0}
Output: 0


 */
public class CountOnes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        input.nextLine();
        for (int i = 0; i < N;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(countOnes(arr));
    }

    private static int countOnes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length;i++){
            if (arr[i] == 1){
                count++;
            }
        }
        return count;
    }
}
