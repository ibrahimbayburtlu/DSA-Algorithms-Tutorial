package Algorithms.Searching.easy;

import java.util.HashSet;

/*
Given three Sorted arrays in non-decreasing order, print all common elements in these arrays.
Examples:

Input:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80

Input:
ar1[] = {1, 5, 5}
ar2[] = {3, 4, 5, 5, 10}
ar3[] = {5, 5, 10, 20}
Output: 5, 5

 */
public class FindIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        findIntersection(arr1, arr2, arr3);
    }

    public static void findIntersection(int[] arr1, int[] arr2, int[] arr3) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        for (int num : arr3) {
            if (set1.contains(num) && set2.contains(num)) {
                result.add(num);
            }
        }

        System.out.println("Common elements: " + result);
    }
}
