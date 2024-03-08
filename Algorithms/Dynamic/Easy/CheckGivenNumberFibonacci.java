package Algorithms.Dynamic.Easy;

import java.util.Scanner;

/*
How to check if a given number is Fibonacci number?
Given a number ‘n’, how to check if n is a Fibonacci number. First few Fibonacci numbers are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ..
Examples :
Input : 8
Output : Yes

Input : 34
Output : Yes

Input : 41
Output : No
 */
public class CheckGivenNumberFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        boolean flag = checkGivenNumberFibonacci(N);
        System.out.println(flag ? "Yes" : "No");
    }

    private static boolean checkGivenNumberFibonacci(int n) {

        for (int i = 0; i < n;i++){
            if (fib(i) == n){
                return true;
            }
            if (fib(i) > n){
                return false;
            }
        }
        return false;
    }

    private static int fib(int n){
        if (n < 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
