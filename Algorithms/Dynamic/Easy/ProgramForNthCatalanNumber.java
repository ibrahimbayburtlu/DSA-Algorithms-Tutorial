package Algorithms.Dynamic.Easy;

import java.util.Scanner;

/*
Program for nth Catalan Number
Catalan numbers are defined as a mathematical sequence that consists of positive integers, which can be used to find the number of possibilities of various combinations.

The nth term in the sequence denoted Cn, is found in the following formula: \frac{(2n)!}{((n + 1)! n!)}

The first few Catalan numbers for n = 0, 1, 2, 3, … are : 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
Examples:

Input: n = 6
Output: 132

Input: n = 8
Output: 1430
 */
public class ProgramForNthCatalanNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(programForNthCatalan(n));
    }
    public static int programForNthCatalan(int N){

        int result = 0;
        if (N <= 1){
            return 1;
        }
        for (int i = 0; i < N;i++){
            result += programForNthCatalan(i) * programForNthCatalan(N-i-1);
        }
        return result;
    }
}
