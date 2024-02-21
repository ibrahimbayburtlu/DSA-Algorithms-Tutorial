package Algorithms.Searching.implementation;

public class BinarySearch {
    public static void main(String[] args) {

        int target = 9;
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        int result = binarySearch(arr,target);
        if (result != -1){
            System.out.println("Target indis :" + result);
        }else {
            System.out.println("This array don't have target");
        }

    }
    private static int binarySearch(int[] orderedArray,int target){
        int low = 0;
        int high = orderedArray.length - 1;
        while (high > low){
            int mid = low + (high - low) / 2;
            if (orderedArray[mid] == target){
                return mid;
            }else if (orderedArray[mid] > target){
                high = mid;
            }else if (orderedArray[mid] < target){
                low = mid;
            }
        }
        return -1;
    }
}
