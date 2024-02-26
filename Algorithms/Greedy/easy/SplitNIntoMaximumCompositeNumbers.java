package Algorithms.Greedy.easy;

/*
Split n into maximum composite numbers
Given n, print the maximum number of composite numbers that sum up to n. First few composite numbers are 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, ………
Examples:


Input: 90
Output: 22
Explanation: If we add 21 4's, then we
get 84 and then add 6 to it, we get 90.

Input: 10
Output: 2
Explanation: 4 + 6 = 10
 */
public class SplitNIntoMaximumCompositeNumbers {

    public static int count(int n)
    {
        if (n < 4)
            return -1;

        int rem = n % 4;

        if (rem == 0)
            return n / 4;

        if (rem == 1) {
            if (n < 9)
                return -1;

            return (n - 9) / 4 + 1;
        }

        if (rem == 2)
            return (n - 6) / 4 + 1;

        if (rem == 3) {
            if (n < 15)
                return -1;

            return (n - 15) / 4 + 2;
        }
        return 0;
    }

    public static void main (String[] args)
    {
        int n = 90;
        System.out.println(count(n));

        n = 143;
        System.out.println(count(n));
    }

}
