package Algorithms.Sorting.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    // Time Complexity : O(n^2)
    // Space Complexity : O(1)
    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n;i++){
            int minIndex = i;
            for (int j = i + 1; j< n;j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
