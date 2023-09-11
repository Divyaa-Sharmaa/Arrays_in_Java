package Arrays_in_Java;

import java.util.Scanner;

public class buy_Sell {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] arr = new int[num];
        inputArr(arr);
        int profit = buyAndSellStocks(arr);
        System.out.println("Profit: " + profit);
    }

    public static void inputArr(int[] arr){
        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int buyAndSellStocks(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length;i++){
            if(buyPrice<prices[i]){
                int Profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit, Profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    
}
