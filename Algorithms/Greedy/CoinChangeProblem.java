package Algorithms.Greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoinChangeProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        Map<Integer,Integer> coins = giveChange(amount);
        for (Map.Entry<Integer,Integer> entry : coins.entrySet()){
            System.out.println(entry.getKey() + " kr: "+ entry.getValue() + " adet");
        }
    }
    public static Map<Integer, Integer> giveChange(int amount) {
        int[] coinValues = {25, 10, 5, 1};
        Map<Integer, Integer> coinCounts = new HashMap<>();

        for (int value : coinValues) {
            int count = amount / value;
            coinCounts.put(value, count);
            amount %= value;
        }

        return coinCounts;
    }
}
