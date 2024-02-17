package Algorithms.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Heap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(heapSort(arr)));
    }

    // Time Complexity : O(NlogN)
    // Space Complexity : O(1)
    private static int[] heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i>= 0; i--){
            heapify(arr,n,i);
        }
        for (int i = n - 1; i>= 0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
        return arr;
    }

    public static void heapify(int[] arr,int n,int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}
