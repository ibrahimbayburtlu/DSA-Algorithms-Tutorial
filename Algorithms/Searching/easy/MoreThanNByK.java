package Algorithms.Searching.easy;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

/*
Given an array of size n and an integer k, find all elements in the array that appear more than n/k times.

Examples:

Input: arr[] = {3, 1, 2, 2, 1, 2, 3, 3}, k = 4
Output: {2, 3}
Explanation: Here n/k is 8/4 = 2, therefore 2 appears 3 times in the
array that is greater than 2 and 3 appears 3 times in the array that is greater than 2

Input: arr[] = {9, 8, 7, 9, 2, 9, 7}, k = 3
Output: {9}
Explanation: Here n/k is 7/3 = 2, therefore 9 appears 3 times in the array that is greater than 2.
 */
public class MoreThanNByK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        input.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i < N;i++){
            arr[i] = input.nextInt();
        }
        moreThanNByK(arr,K);
    }

    public static void moreThanNByK(int[] arr,int k){

        int n = arr.length / k;
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length;i++){
            if (!hashtable.containsKey(arr[i])){
                hashtable.put(arr[i],1);
            }else {
                int count = hashtable.get(arr[i]);
                hashtable.put(arr[i],++count);
            }
            hashSet.add(arr[i]);
        }
        for (int value : hashSet){
            if (hashtable.get(value) > n){
                System.out.print(value + " ");
            }
        }
    }
}
