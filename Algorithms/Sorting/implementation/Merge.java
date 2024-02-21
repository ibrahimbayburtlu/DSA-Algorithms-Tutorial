package Algorithms.Sorting.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    // Time Complexity : O(NlogN)
    // Space Complexity : O(n)
    public static int[] mergeSort(int[] arr){

        if (arr.length > 1){
            int mid = arr.length / 2;
            int[] leftArray = new int[mid];
            int[] rightArray = new int[arr.length - mid];

            for (int i = 0; i < mid;i++){
                leftArray[i] = arr[i];
            }

            for (int i = mid; i < arr.length;i++){
                rightArray[i - mid] = arr[i];
            }

            mergeSort(leftArray);
            mergeSort(rightArray);
            return merge(leftArray,rightArray,arr);
        }
        return arr;
    }
    public static int[] merge(int[] rightArray,int[] leftArray,int[] array){
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftArray.length && j < rightArray.length){
            if (leftArray[i] < rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArray.length){
            array[k] = rightArray[j];
            j++;
            k++;
        }
        return array;
    }

}
