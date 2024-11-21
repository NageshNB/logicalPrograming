public class SimpleBuyAndSellStocks {
    public static void main(String[] args) {
        int[] price = {7,1,5,3,7,4};

        System.out.println("the maximum profit is "+buyAndSellStocks(price));
    }

    static int buyAndSellStocks(int[] price){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0 ; i < price.length;i++){
            int sellingPrice = price[i];
            if(buyPrice < sellingPrice){
                int curProfit = sellingPrice - buyPrice;
                maxProfit = Math.max(maxProfit, curProfit);
            }
            else{
                buyPrice = sellingPrice;
            }
        }

        return maxProfit;
    }
}
