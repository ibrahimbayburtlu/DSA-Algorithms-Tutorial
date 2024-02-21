package Algorithms.Searching.easy;

import java.util.Arrays;

/*
Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.

Note: There are no duplicates in the list.

Examples:

Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
Output: 5
Explanation: Here the size of the array is 7, so the range will be [1, 8]. The missing number between 1 and 8 is 5
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(findMissingNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
        Arrays.sort(arr);
        int count = arr[0];
        for (int i = 0; i < arr.length;i++){
            if (arr[i] != count){
                return count;
            }
            count++;
        }
        return -1;
    }
}
