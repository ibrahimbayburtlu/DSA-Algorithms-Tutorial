package Algorithms.Recursion.implementation;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        System.out.println(fibonacci(N));
    }

    private static int fibonacci(int N) {
        if (N <= 1){
            return N;
        }
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
}
