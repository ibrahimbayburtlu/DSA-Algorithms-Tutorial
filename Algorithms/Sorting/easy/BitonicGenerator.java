package Algorithms.Sorting.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
We are given an array of n distinct numbers.
The task is to sort all even-placed numbers in increasing and odd-placed numbers in decreasing order.
The modified array should contain all sorted even-placed numbers followed by reverse sorted odd-placed numbers.

Note that the first element is considered as even placed because of its index 0.

Examples:

Input:  arr[] = {0, 1, 2, 3, 4, 5, 6, 7}
Output: arr[] = {0, 2, 4, 6, 7, 5, 3, 1}
Even-place elements : 0, 2, 4, 6
Odd-place elements : 1, 3, 5, 7
Even-place elements in increasing order :
0, 2, 4, 6
Odd-Place elements in decreasing order :
7, 5, 3, 1

Input: arr[] = {3, 1, 2, 4, 5, 9, 13, 14, 12}
Output: {2, 3, 5, 12, 13, 14, 9, 4, 1}
Even-place elements : 3, 2, 5, 13, 12
Odd-place elements : 1, 4, 9, 14
Even-place elements in increasing order :
2, 3, 5, 12, 13
Odd-Place elements in decreasing order :
14, 9, 4, 1
 */

public class BitonicGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i< N; i++){
            arr[i] = input.nextInt();
        }

        int[] result = bitonicGenerator(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] bitonicGenerator(int[] arr){

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0) {
                evenList.add(arr[i]);
            } else {
                oddList.add(arr[i]);
            }
        }

        Collections.sort(evenList);
        oddList.sort(Collections.reverseOrder());

        int[] result = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = evenList.get(evenIndex++);
            } else {
                result[i] = oddList.get(oddIndex++);
            }
        }

        return result;
    }
}
