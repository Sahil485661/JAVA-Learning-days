// in this question we have given price of a stock of six we need to find the maximum selling price and minimum buy price
// and also find the max profit . the main thing is we can not go back previous day like "If we are 1 day has 7 price then 2nd
// day is 1 price then we cannot sell the stock in 7 after buy the stock in 1 price. we are always goes forward
package Array;
public class Buy_SellStock {
    public static void stock(int price[]){
        int minbuy = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i = 0; i<price.length; i++){
            // Now in this line we check today price is bigger then buy_price if true than find the profit
            // by using this formula profit = selling price - minbuy
            if(minbuy < price[i]){          //price[i] is known as selling price
                int profit = price[i] - minbuy;
                max_profit = Math.max(profit, max_profit); //Here we find the max profit
            }
            else{
                minbuy = price[i];
            }
        }
        int selling_Price = minbuy + max_profit;
        System.out.println("Minimum Buy price: " +minbuy);
        System.out.println("Maximum Selling price is :" +selling_Price);
        System.out.println("total max profit is :" +max_profit);
    }
    public static void main(String args[]){
        // Here are the six days price of stock we need to find the maximum profit when we found 
        int price[] = {7,1,5,3,6,4};
        stock(price);
    }
}
