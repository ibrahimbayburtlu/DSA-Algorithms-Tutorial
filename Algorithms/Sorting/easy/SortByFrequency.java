package Algorithms.Sorting.easy;

import java.util.*;

/*
Print the elements of an array in the decreasing frequency if 2 numbers have the same frequency then print the one which came first

Examples:

Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}


 */
public class SortByFrequency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        input.nextLine();
        for (int i = 0; i < N;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(sortByFrequency(arr)));
    }

    public static int[] sortByFrequency(int[] arr){
        Map<Integer, Integer> freqCounter = new HashMap<>();
        for (int num : arr) {
            freqCounter.put(num, freqCounter.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(arr);
        Integer[] temp = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {
            if (freqCounter.get(a).equals(freqCounter.get(b))) {
                return Integer.compare(indexOf(arr, a), indexOf(arr, b));
            } else {
                return Integer.compare(freqCounter.get(b), freqCounter.get(a));
            }
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }

    private static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length;i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}
