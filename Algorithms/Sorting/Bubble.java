package Algorithms.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    // Time Complexity : O(n^2)
    // Space Complexity : O(1)
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n;i++){
            for (int j = i +1 ; j < n ;j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
