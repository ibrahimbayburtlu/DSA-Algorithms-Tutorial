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
public class RecursivelyRemoveAllKeepduplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println(recursivelyRemoveAllKeepDuplicates(word));
    }

    public static String recursivelyRemoveAllKeepDuplicates(String word){

        if (word.isEmpty() || word.length() == 1) {
            return word;
        }

        String resultWord = String.valueOf(word.charAt(0));

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(i - 1)) {
                if (i + 1 < word.length() && word.charAt(i) == word.charAt(i + 1)) {
                    i++;
                } else {
                    resultWord += word.charAt(i);
                }
            }
        }
        if (!resultWord.equals(word)) {
            return recursivelyRemoveAllKeepDuplicates(resultWord);
        }
        return resultWord;
    }
}
