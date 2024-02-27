package Algorithms.Greedy.easy;

import java.util.Stack;

/*
Given three stacks of the positive numbers, the task is to find the possible
equal maximum sum of the stacks with the removal of top elements allowed.
Stacks are represented as an array, and the first index of the array represent the top element of the stack.

Examples:

Input :
    stack1[] = { 3, 10}
    stack2[] = { 4, 5 }
    stack3[] = { 2, 1 }
Output : 0
Sum can only be equal after removing all elements from all stacks.
 */
public class FindMaximumEqualsSumOfEveryThreeStacks {
    public static void main(String[] args) {
        int[] stack1 = {3,2,1,1,1};
        int[] stack2 = {4,3,2};
        int[] stack3 = {1,1,4,1};
        System.out.println(findMaximumEqualsStack(stack1,stack2,stack3));
    }
    public static int findMaximumEqualsStack(int[] stack1,int[] stack2,int[] stack3){
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int j : stack1) {
            sum1 += j;
        }
        for (int j : stack2) {
            sum2 += j;
        }
        for (int j : stack3) {
            sum3 += j;
        }

        int top1 = 0,top2 = 0,top3 = 0;

        while (true) {
            if (top1 == stack1.length || top2 == stack2.length || top3 == stack3.length){
                return 0;
            }

            if (sum1 == sum2 && sum2 == sum3)
                return sum1;

            if (sum1 >= sum2 && sum1 >= sum3)
                sum1 -= stack1[top1++];
            else if (sum2 >= sum1 && sum2 >= sum3)
                sum2 -= stack2[top2++];
            else if (sum3 >= sum2 && sum3 >= sum1)
                sum3 -= stack3[top3++];
        }
    }
}
