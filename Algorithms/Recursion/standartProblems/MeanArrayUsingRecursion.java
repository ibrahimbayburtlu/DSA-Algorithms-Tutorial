package Algorithms.Recursion.standartProblems;

import java.util.Arrays;
import java.util.Scanner;
/*
Mean of array using recursion
To find the mean of the elements of the array.

Mean = (Sum of elements of the Array) /
       (Total no of elements in Array)
Examples:

Input : 1 2 3 4 5
Output : 3

Input : 1 2 3
Output : 2
To find the mean using recursion assume that the problem is
already solved for N-1 ie you have to find for n

Sum of first N-1 elements =
                 (Mean of N-1 elements)*(N-1)

Mean of N elements = (Sum of first N-1 elements +
                      N-th elements) / (N)
Note : Since array indexing starts from 0, we access N-th element using A[N-1].

 */
public class MeanArrayUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        input.nextLine();
        int[] arr = new int[N];

        for (int i = 0; i < N;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(findMean(arr,arr.length));
    }

    private static float findMean(int[] arr,int N) {

        if (N == 1){
            return (float) arr[N - 1];
        }else {
            float v = (float) (findMean(arr, N - 1) * (N - 1) +
                    arr[N - 1]) / N;
            return v;
        }
    }
}
