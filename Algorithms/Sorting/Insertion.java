package Algorithms.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N;i++){
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(selectionSort(arr)));

    }
    // Time Complexity : O(n^2)
    // Space Complexity : O(1)
    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while (j>= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
