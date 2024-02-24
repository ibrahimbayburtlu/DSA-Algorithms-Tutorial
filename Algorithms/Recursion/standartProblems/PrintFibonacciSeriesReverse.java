package Algorithms.Recursion.standartProblems;

import java.util.Scanner;
/*
Print Fibonacci Series in reverse order using Recursion
Given an integer N, the task is to print the first N terms of the
Fibonacci series in reverse order using Recursion.

Examples:

Input: N = 5
Output: 3 2 1 1 0
Explanation: First five terms are – 0 1 1 2 3.

Input: N = 10
Output: 34 21 13 8 5 3 2 1 1 0
 */
public class PrintFibonacciSeriesReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        printFibonacciSeriesReverse(N,0,1);
    }

    public static void printFibonacciSeriesReverse(int N,int a,int b){
        if (N >= 1){
            printFibonacciSeriesReverse(N - 1,b,a+b);
            System.out.print(a + " ");
        }
    }
}
