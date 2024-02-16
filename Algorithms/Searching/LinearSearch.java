package Algorithms.Searching;

public class LinearSearch{
    public static void main(String[] args) {

        int[] arr = new int[]{0,2,4,1,3,5,7,6,9,8,-1};
        int target = 8;
        boolean result = linearSearch(arr,target);
        if (result){
            System.out.println("The Array have target.");
        }else {
            System.out.println("The Array don't have target.");
        }
    }

    // Time Complexity : O(n)
    // Space Complexity : O(1)
    private static boolean linearSearch(int[] arr, int target){
        for (int elem : arr) {
            if (elem == target) {
                return true;
            }
        }
        return false;
    }
}
