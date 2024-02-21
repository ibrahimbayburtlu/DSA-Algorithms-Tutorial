package Algorithms.Searching.easy;

import java.util.Scanner;

/*
Given a sorted array and a value x, the ceiling of x is the smallest element
in an array greater than or equal to x,  and the floor is the greatest element smaller than or equal to x.
Assume that the array is sorted in non-decreasing order.
Write efficient functions to find the floor and ceiling of x.
Examples :

For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
For x = 0:    floor doesn't exist in array,  ceil  = 1
For x = 1:    floor  = 1,  ceil  = 1
For x = 5:    floor  = 2,  ceil  = 8
For x = 20:   floor  = 19,  ceil doesn't exist in array
 */
public class CeilSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int N = input.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of the array in non-decreasing order:");
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        int[] x = {0, 1, 5, 20};
        findCeilAndFloor(arr, x);
    }

    private static void findCeilAndFloor(int[] arr, int[] x) {
        for (int i = 0; i < x.length; i++) {
            int ceil = findCeil(arr, x[i]);
            int floor = findFloor(arr, x[i]);
            System.out.println("For x = " + x[i] + ": floor = " + floor + ", ceil = " + ceil);
        }
    }

    private static int findCeil(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int ceil = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return arr[mid];
            else if (arr[mid] < x)
                low = mid + 1;
            else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }
        return ceil;
    }

    private static int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int floor = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return arr[mid];
            else if (arr[mid] < x) {
                floor = arr[mid];
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return floor;
    }
}
