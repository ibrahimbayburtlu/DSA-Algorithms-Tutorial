package Algorithms.Recursion.standartProblems;

import java.util.Scanner;
/*
Sum of natural numbers using recursion
Given a number n, find sum of first n natural numbers.
To calculate the sum, we will use a recursive function recur_sum().
Examples :


Input : 3
Output : 6
Explanation : 1 + 2 + 3 = 6

Input : 5
Output : 15
Explanation : 1 + 2 + 3 + 4 + 5 = 15
 */
public class SumOfNaturalUsingRecursion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(sumOfNatural(N));
    }

    public static int sumOfNatural(int N){
        if (N == 1){
            return 1;
        }
        return N + sumOfNatural(N - 1);
    }
}
