package Algorithms.Searching.easy;

import java.util.Arrays;
import java.util.Scanner;

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
