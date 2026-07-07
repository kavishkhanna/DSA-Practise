public class BestTimeToBuyAndSellStock {

    public static void main(String args[]){


    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = prices[0];

        for(int i = 1; i < prices.length ; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }else {
                int sellPrice = prices[i] - buyPrice;
                if(sellPrice > maxProfit){
                    maxProfit = sellPrice;
                }
            }
        }

        return maxProfit;

    }
}
