package Algorithms.Dynamic.Easy;

import java.util.Scanner;

/*
Nth Fibonacci Number
Given a number n, print n-th Fibonacci Number.

The Fibonacci numbers are the numbers in the following integer sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
Examples:
Input  : n = 1

Output : 1

Input  : n = 9

Output : 34

Input  : n = 10

Output : 55
 */
public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(fib(N));
    }
    public static int fib(int n){
        if (n < 2){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
