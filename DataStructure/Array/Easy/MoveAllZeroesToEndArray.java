package DataStructure.Array.Easy;

/*
Given an array of random numbers, Push all the zero’s of a given array to the end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).

Example:

Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};

Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
 */
public class MoveAllZeroesToEndArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] arr2 = {1, 2, 0, 0, 0, 3, 6};

        moveZeroesToEnd(arr1);
        moveZeroesToEnd(arr2);

        System.out.print("Output for arr1: ");
        printArray(arr1);
        System.out.print("Output for arr2: ");
        printArray(arr2);
    }

    public static void moveZeroesToEnd(int[] arr) {
        int n = arr.length;
        int nonZeroPointer = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroPointer] = arr[i];
                if (i != nonZeroPointer)
                    arr[i] = 0;
                nonZeroPointer++;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
