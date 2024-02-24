package Algorithms.Recursion.standartProblems;

import java.util.Scanner;

/*
Given a string, recursively remove adjacent duplicate characters from the string.
The output string should not have any adjacent duplicates. See the following examples.

Examples:

Input: azxxzy
Output: ay

First “azxxzy” is reduced to “azzy”.
The string “azzy” contains duplicates,
so it is further reduced to “ay”.
Input: geeksforgeeg
Output: gksfor
 */
public class PrintOneNoLoopNToOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        printOneNoLoopNToOne(N);
    }

    public static void printOneNoLoopNToOne(int N){

        if (N > 0){
            System.out.print(N + " ");
            printOneNoLoopNToOne(N - 1);
        }
    }
}
