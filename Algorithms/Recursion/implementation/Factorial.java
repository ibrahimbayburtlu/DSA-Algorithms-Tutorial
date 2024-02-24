package Algorithms.Recursion.implementation;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        System.out.println(factorial(N));
    }

    public static int factorial(int N){
        if (N  <= 1){
            return 1;
        }
        return N * factorial(N - 1);
    }

}
