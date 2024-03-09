package Algorithms.Dynamic.Easy;

import java.util.Scanner;

/*
The following are the common definitions of Binomial Coefficients.

A binomial coefficient C(n, k) can be defined as the coefficient of x^k in the expansion of (1 + x)^n.

A binomial coefficient C(n, k) also gives the number of ways, disregarding order, that k objects can be chosen from among n objects more formally,
the number of k-element subsets (or k-combinations) of a n-element set.
 */
public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        System.out.println(binomialCoeff(N,K));

    }
    public static int binomialCoeff(int N,int K){
        if (K > N){
            return 0;
        }
        if (K == 0 || K == N){
            return 1;
        }
        return binomialCoeff(N - 1,K - 1) + binomialCoeff(N - 1,K);
    }
}
