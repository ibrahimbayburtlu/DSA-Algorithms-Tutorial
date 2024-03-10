package Algorithms.Dynamic.Easy;

import java.util.Scanner;

public class SubsetSumProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int sum = input.nextInt();
        input.nextLine();
        int[] sets = new int[N];
        for (int i = 0; i < N;i++){
            sets[i] = input.nextInt();
        }
        System.out.println(subsetSum(N,sum,sets));
    }
    public static boolean subsetSum(int N,int sum,int[] sets){
        if (sum == 0){
            return true;
        }
        if (N == 0){
            return false;
        }
        if (sets[N-1] > sum){
            return subsetSum(N-1,sum,sets);
        }
        return subsetSum(N-1,sum,sets) || subsetSum(N-1,sum-sets[N-1],sets);
    }
}
