package Algorithms.Recursion.standartProblems;

import java.util.Scanner;
/*
Given a string str representing a string, the task is to convert the given string into an integer.
Examples:


Input: str = “1234”
Output: 1234
Input: str = “0145”
Output: 145
 */
public class ConvertStringIntegerUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        System.out.println(convertInteger(word));
    }
    public static int convertInteger(String word){
        if (word.length() == 1) {
            return word.charAt(0) - '0';
        }

        char lastDigit = word.charAt(word.length() - 1);
        String remaining = word.substring(0, word.length() - 1);
        int remainingInteger = convertInteger(remaining);

        int lastDigitInteger = lastDigit - '0';
        return remainingInteger * 10 + lastDigitInteger;
    }
}
