package Algorithms.Sorting;

import java.util.*;

public class Bucket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        double[] arr = new double[N];
        for (int i = 0; i < N;i++){
            arr[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(bucketSort(arr)));
    }

    // Time Complexity : O(n^2)
    // Space Complexity : (n + k)
    public static double[] bucketSort(double[] arr) {
        int n = arr.length;
        List<List<Double>> buckets = new ArrayList<>(n);


        for (int i = 0; i < n; i++) {
            buckets.add(new ArrayList<>());
        }


        for (double num : arr) {
            int bucketIndex = (int) (n * num);
            buckets.get(bucketIndex).add(num);
        }


        for (List<Double> bucket : buckets) {
            Collections.sort(bucket);
        }


        int index = 0;
        for (List<Double> bucket : buckets) {
            for (double num : bucket) {
                arr[index++] = num;
            }
        }
        return arr;
    }

}
