package org.example;

import java.util.HashMap;

public class Fedility
{

    /*
    Given an array of numbers representing the stock prices of a company in
    chronological order, write a function that calculates the maximum profit you
    could have made from buying and selling that stock once. You must buy before you
    can sell it.
For example, given [9, 11, 8, 5, 7, 10],
 you should return 5, since you could buy the stock at 5 dollars and sell it at 10 dollars.
     */
    public static void main(String[] args) {
        int[] stockPrice = {9,11,8,5,7,10};
        int maxProfit = 0;
        int finalProfit = maxProfit;
        for(int i=0;i<stockPrice.length-1;i++){
            for(int j= i+1;j<=stockPrice.length-1;j++){
                int profit =  stockPrice[i] - stockPrice[j];
                profit = profit * -1;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
            if(finalProfit < maxProfit){
                finalProfit = maxProfit;
            }
        }
        System.out.println(finalProfit);

    }
}
