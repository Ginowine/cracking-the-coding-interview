package DataStructures;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);

        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestBuy = prices[0];

        for(int price:prices){
            if(price < bestBuy){
                bestBuy = price;
            }else if(price - bestBuy > maxProfit){
                maxProfit = price - bestBuy;
            }
        }

        return maxProfit;
    }
}
