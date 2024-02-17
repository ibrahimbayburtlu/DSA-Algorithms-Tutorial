package Algorithms.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N;i++){
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(radixSort(arr)));
    }
    // Time Complexity : O(n + k)
    // Space Complexity : O(n + k)
    public static int[] radixSort(int[] arr) {
        int n = arr.length;


        int max = getMax(arr, n);


        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, n, exp);

        return arr;
    }

    private static int getMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    private static void countingSort(int[] arr, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

}
