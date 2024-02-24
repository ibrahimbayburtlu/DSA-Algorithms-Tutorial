package Algorithms.Recursion.standartProblems;

import java.util.Scanner;
/*
You are given an integer N. Print numbers from 1 to N without the help of loops.

Examples:

Input: N = 5
Output: 1 2 3 4 5
Explanation: We have to print numbers from 1 to 5.

Input: N = 10
Output: 1 2 3 4 5 6 7 8 9 10
Explanation: We have to print numbers from 1 to 10.
 */
public class PrintOneNoLoopOneToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        printOneNoLoopOneToN(N);
    }

    public static void printOneNoLoopOneToN(int N){

        if (N > 0){
            printOneNoLoopOneToN(N - 1);
            System.out.println(N + " ");
        }
    }
}
