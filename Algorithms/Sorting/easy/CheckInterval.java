package Algorithms.Sorting.easy;

import java.util.Arrays;
import java.util.Scanner;

/*
An interval is represented as a combination of start time and end time. Given a set of intervals,
check if any two intervals intersect.

Examples:

Input:  arr[] = {{1, 3}, {5, 7}, {2, 4}, {6, 8}}
Output: true
The intervals {1, 3} and {2, 4} overlap


Input:  arr[] = {{1, 3}, {7, 9}, {4, 6}, {10, 13}}
Output: false
No pair of intervals overlap.
 */
public class CheckInterval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N;i++){
            for (int j = 0; j < 2;j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(checkInterval(arr));
    }

    public static boolean checkInterval(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i][1] > arr[i + 1][0]) {
                return true;
            }
        }
        return false;
    }
}
