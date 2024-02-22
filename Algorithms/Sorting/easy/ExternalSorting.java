package Algorithms.Sorting.easy;

import java.util.Arrays;

/*
Given N machines. Each machine contains some numbers in sorted form.
But the amount of numbers, each machine has is not fixed.
Output the numbers from all the machine in sorted non-decreasing form.
Example:

Machine M1 contains 3 numbers: {30, 40, 50}
Machine M2 contains 2 numbers: {35, 45}
Machine M3 contains 5 numbers: {10, 60, 70, 80, 100}
Output: {10, 30, 35, 40, 45, 50, 60, 70, 80, 100}
 */

public class ExternalSorting {
    public static void main(String[] args) {
        int[] arr1 = new int[]{30,40,50};
        int[] arr2 = new int[]{35,45};
        int[] arr3 = new int[]{10,60,70,80,100};

        System.out.println(Arrays.toString(externalSorting(arr1, arr2, arr3)));
    }

    public static int[] externalSorting(int[] arr1, int[] arr2, int[] arr3){

        int[] arr = new int[arr1.length + arr2.length +arr3.length];
        int tempLength = 0;
        System.arraycopy(arr1, 0, arr, 0, arr1.length);

        tempLength += arr1.length;
        System.arraycopy(arr2, 0, arr, tempLength, arr2.length);

        tempLength += arr2.length;

        System.arraycopy(arr3, 0, arr, tempLength, arr3.length);
        Arrays.sort(arr);
        return arr;
    }
}
