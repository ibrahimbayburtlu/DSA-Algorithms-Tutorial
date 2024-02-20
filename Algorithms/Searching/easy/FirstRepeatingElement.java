package Algorithms.Searching.easy;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeatingElement(arr));
    }

    public static int firstRepeatingElement(int[] arr) {

        int  n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;

    }
}
