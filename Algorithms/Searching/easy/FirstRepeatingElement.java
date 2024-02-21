package Algorithms.Searching.easy;
/*
Given an unsorted array of size n. Array elements are in the range of 1 to n.
One number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.

Examples:

Input: arr[] = {3, 1, 3}
Output: Missing = 2, Repeating = 3
Explanation: In the array, 2 is missing and 3 occurs twice

Input: arr[] = {4, 3, 6, 2, 1, 1}
Output: Missing = 5, Repeating = 1
 */
public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeatingElement(arr));
    }

    public static int firstRepeatingElement(int[] arr) {

        int  n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;

    }
}
