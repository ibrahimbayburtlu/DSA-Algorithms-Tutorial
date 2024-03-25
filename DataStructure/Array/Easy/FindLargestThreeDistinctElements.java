package DataStructure.Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

/*
Find the largest three distinct elements in an array
Given an array with all distinct elements, find the largest three elements.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1).

Examples :

Input: arr[] = {10, 4, 3, 50, 23, 90}
Output: 90, 50, 23
 */
public class FindLargestThreeDistinctElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length;i++){
            arr[i] = input.nextInt();
        }
        findLargestThreeDistinctElement(N,arr);
    }

    public static void findLargestThreeDistinctElement(int N,int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        if (N < 3){
            System.out.println("Invalid input ");
        }

        for (int i = 0; i < N;i++){
            if (arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }else if (arr[i] > second){
                third = second;
                second = arr[i];
            }else if (arr[i] > third)
                third = arr[i];
        }
        System.out.printf("Three Largest elements are %d %d %d",first,second,third);
    }
}
