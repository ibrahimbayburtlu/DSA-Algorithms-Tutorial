package Algorithms.Searching.easy;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(findMissingNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
        Arrays.sort(arr);
        int count = arr[0];
        for (int i = 0; i < arr.length;i++){
            if (arr[i] != count){
                return count;
            }
            count++;
        }
        return -1;
    }
}
