package Algorithms.Greedy.easy;

import java.util.Arrays;
import java.util.Scanner;
/*
In a candy store, there are N different types of candies available and the
prices of all the N different types of candies are provided.
There is also an attractive offer by the candy store.
 We can buy a single candy from the store and get at most K other candies (all are different types) for free.

Find the minimum amount of money we have to spend to buy all the N different candies.
Find the maximum amount of money we have to spend to buy all the N different candies.
In both cases, we must utilize the offer and get the maximum possible candies back.
If k or more candies are available, we must take k candies for every candy purchase. If less than k candies are available, we must take all candies for a candy purchase.

Examples:

Input :
price[] = {3, 2, 1, 4}
k = 2
Output :
Min = 3, Max = 7
Explanation :
Since k is 2, if we buy one candy we can take
almost two more for free.
So in the first case we buy the candy which
costs 1 and take candies worth 3 and 4 for
free, also you buy candy worth 2 as well.
So min cost = 1 + 2 = 3.
In the second case we buy the candy which
costs 4 and take candies worth 1 and 2 for
free, also We buy candy worth 3 as well.
So max cost = 3 + 4 = 7.
 */
public class FindMinimumAndMaximumNCandies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        input.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i < N;i++){
            arr[i] = input.nextInt();
        }
        findMinimumAndMaximum(arr,K);
    }

    public static void findMinimumAndMaximum(int[] arr,int K){
        Arrays.sort(arr);
        int minTotal = 0 ;
        int maxTotal = 0;
        for (int i = 0; i < K;i++){
            minTotal += arr[i];
            maxTotal += arr[arr.length - i - 1];
        }
        System.out.println("Min:" + minTotal + " Max:" + maxTotal);
    }
}
