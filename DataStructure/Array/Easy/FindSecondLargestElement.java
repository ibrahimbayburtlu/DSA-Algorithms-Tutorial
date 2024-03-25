package DataStructure.Array.Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/*
Find Second-largest element in an array
Given an array of integers, our task is to write a program that efficiently finds the second-largest element present in the array.

Examples:

Input: arr[] = {12, 35, 1, 10, 34, 1}
Output: The second-largest element is 34.
Explanation: The largest element of the array is 35 and the second-largest element is 34

Input: arr[] = {10, 5, 10}
Output: The second-largest element is 5.
Explanation: The largest element of the array is 10 and the second-largest element is 5
Input: arr[] = {10, 10, 10}
Output: The second largest does not exist.
Explanation: Largest element of the array is 10 there is no second-largest element
 */
public class FindSecondLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length;i++){
            arr[i] = input.nextInt();
        }
        findSecondLargestElement(N,arr);
    }

    private static void findSecondLargestElement(int n, int[] arr) {
        Arrays.sort(arr);

        for (int i = arr.length - 2; i > -1;i--){
            if (arr[i] != arr[arr.length - 1]){
                System.out.printf("The Second largest element is %d\n",arr[i]);
                return;
            }
        }
        System.out.print("There is no second largest element");
    }
}
