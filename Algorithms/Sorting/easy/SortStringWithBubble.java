package Algorithms.Sorting.easy;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array of strings arr[]. Sort given strings using Bubble Sort and display the sorted array.

In Bubble Sort, the two successive strings arr[i] and arr[i+1] are exchanged whenever arr[i]> arr[i+1].
The larger values sink to the bottom and are hence called sinking sort. At the end of each pass, smaller values gradually “bubble” their way upward to the top and hence called bubble sort.

 After all the passes, we get all the strings in sorted order
 */
public class SortStringWithBubble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(sortStringWithBubble(arr)));
    }

    public static String[] sortStringWithBubble(String[] arr) {
        String temp;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[j].compareTo(arr[i]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
