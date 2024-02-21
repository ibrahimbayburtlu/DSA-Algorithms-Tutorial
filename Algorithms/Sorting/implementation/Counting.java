package Algorithms.Sorting.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(countingSort(arr)));
    }

    // Time Complexity : O(n + k)
    // Space Complexity : O(n + k)
    public static int[] countingSort(int[] arr){
        int n = arr.length;


        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }


        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }


        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }


        int[] sortedArr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            sortedArr[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }


        for (int i = 0; i < n; i++) {
            arr[i] = sortedArr[i];
        }

        return arr;
    }

}
