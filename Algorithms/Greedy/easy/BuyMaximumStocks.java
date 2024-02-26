package Algorithms.Greedy.easy;

/*
In a stock market, there is a product with its infinite stocks. The stock prices are given for N days, where arr[i]
denotes the price of the stock on the ith day. There is a rule that a customer can buy at most i stock on the ith day.
If the customer has k amount of money initially, find out the maximum number of stocks a customer can buy.

For example, for 3 days the price of a stock is given as 7, 10, 4. You can buy 1 stock worth 7 rs on day 1, 2
stocks worth 10 rs each on day 2 and 3 stock worth 4 rs each on day 3.

Examples:

Input : price[] = { 10, 7, 19 },
              k = 45.
Output : 4
A customer purchases 1 stock on day 1 for 10 rs,
2 stocks on day 2 for 7 rs each and 1 stock on day 3 for 19 rs.Therefore total of
10, 7 * 2 = 14 and 19 respectively. Hence,
total amount is 10 + 14 + 19 = 43 and number
of stocks purchased is 4.

Input  : price[] = { 7, 10, 4 },
               k = 100.
Output : 6
 */


import java.util.Arrays;

public class BuyMaximumStocks {

    public static int buyMaximumStocks(int[] prices, int k) {
        int n = prices.length;
        int[][] stockInfo = new int[n][2]; // [fiyat, gün]

        // Her gün için fiyat ve gün bilgisini kaydediyoruz
        for (int i = 0; i < n; i++) {
            stockInfo[i][0] = prices[i];
            stockInfo[i][1] = i + 1;
        }

        // Fiyata göre sıralama yapıyoruz
        Arrays.sort(stockInfo, (a, b) -> Integer.compare(a[0], b[0]));

        int maxStocks = 0;
        for (int i = 0; i < n; i++) {
            // Günlük hisse senedi alımı için bütçeye dikkat ediyoruz
            int price = stockInfo[i][0];
            int day = stockInfo[i][1];
            int stocksToBuy = Math.min(k / price, day); // bütçeyle alınabilecek maksimum hisse senedi
            maxStocks += stocksToBuy;
            k -= price * stocksToBuy; // kullanılan bütçeyi güncelle
        }

        return maxStocks;
    }

    public static void main(String[] args) {
        int[] prices1 = {10, 7, 19};
        int k1 = 45;
        System.out.println(buyMaximumStocks(prices1, k1));

        int[] prices2 = {7, 10, 4};
        int k2 = 100;
        System.out.println(buyMaximumStocks(prices2, k2));
    }
}
