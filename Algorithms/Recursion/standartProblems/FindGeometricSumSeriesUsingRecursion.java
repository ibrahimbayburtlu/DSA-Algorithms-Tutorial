package Algorithms.Recursion.standartProblems;

import java.util.Scanner;
/*
Find geometric sum of the series using recursion
Given an integer N, we need to find the geometric sum of the following series using recursion.


1 + 1/3 + 1/9 + 1/27 + … + 1/(3^n)

Examples:

Input N = 5
Output: 1.49794

Input: N = 7
Output: 1.49977
 */
public class FindGeometricSumSeriesUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(findGeometricSumSeries(N));
    }

    public static double findGeometricSumSeries(int N){
        if (N == 0){
            return 1;
        }
        return 1 / Math.pow(3,N) + (findGeometricSumSeries(N - 1));
    }
}
