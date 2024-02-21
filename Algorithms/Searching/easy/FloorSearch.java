package Algorithms.Searching.easy;

import java.util.Scanner;
/*
Given a sorted array and a value x, the floor of x is the largest element in the array smaller than or equal to x.
Write efficient functions to find the floor of x

Examples:

    Input: arr[] = {1, 2, 8, 10, 10, 12, 19}, x = 5
    Output: 2
    Explanation: 2 is the largest element in
    arr[] smaller than 5

    Input: arr[] = {1, 2, 8, 10, 10, 12, 19}, x = 20
    Output: 19
    Explanation: 19 is the largest element in
    arr[] smaller than 20
 */
public class FloorSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int x = input.nextInt();
        input.nextLine();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(floorSearch(arr,x));
    }
    public static int floorSearch(int[] arr,int x){
        int minNumber = 0;
        for (int j : arr) {
            if (j < x) {
                minNumber = j;
            }
        }
        return minNumber;
    }
}
