package Algorithms.Searching.easy;

import java.util.Scanner;
/*
An Array of integers is given, both +ve and -ve.
You need to find the two elements such that their sum is closest to zero.
 */
public class MinAbsSumPair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        input.nextLine();
        for (int i = 0; i < N;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(minAbsSumPair(arr,N));
    }

    private static int minAbsSumPair(int[] arr, int n) {
        int minTotal = Integer.MAX_VALUE;
        for (int i = 0; i < n;i++){
            for (int j = 0; j < n;j++){
                if (Math.abs(arr[i] + arr[j]) < minTotal && arr[i] > 0 && arr[j] < 0 && i != j){
                    minTotal = Math.abs(arr[i] + arr[j]);
                }
            }
        }
        return minTotal;
    }
}
