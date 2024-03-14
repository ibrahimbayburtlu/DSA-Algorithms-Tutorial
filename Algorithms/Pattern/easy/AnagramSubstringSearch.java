package Algorithms.Pattern.easy;

import java.util.Arrays;

/*
Anagram Substring Search (Or Search for all permutations)
Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function search(char pat[], char txt[]) that prints all occurrences of pat[] and its permutations (or anagrams) in txt[]. You may assume that n > m.

Expected time complexity is O(n)

Examples:

1) Input:  txt[] = "BACDGABCDA"  pat[] = "ABCD"
   Output:   Found at Index 0
             Found at Index 5
             Found at Index 6
2) Input: txt[] =  "AAABABAA" pat[] = "AABA"
   Output:   Found at Index 0
             Found at Index 1
             Found at Index 4
 */
public class AnagramSubstringSearch {
    public static void main(String[] args) {
        char[] txt = new char[]{'B', 'A', 'C', 'D', 'G', 'A', 'B', 'C', 'D', 'A'};
        char[] path = new char[]{'A', 'B', 'C', 'D'};
        System.out.println(anagramSubstringSearch(txt,path));
    }
    public static boolean anagramSubstringSearch(char[] txt, char[] pat){
        int n = txt.length;
        int m = pat.length;

        char[] sortedpat = pat;
        Arrays.sort(sortedpat);

        String temp;
        for (int i = 0; i <= n - m; i++) {
            temp = "";
            for (int k = i; k < m + i; k++)
                temp += txt[k];
            char tempArray[] = temp.toCharArray();
            Arrays.sort(tempArray);
            temp = new String(tempArray);


            if (String.valueOf(sortedpat).equals(temp))
                System.out.println("Found at Index " + i);
        }
        return false;
    }
}
