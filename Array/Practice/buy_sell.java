package Array.Practice;

public class buy_sell {
    public static int profit(int price[]){
        int buy = Integer.MAX_VALUE;
        int maxprofit =0;
        for(int i = 0; i< price.length; i++){
            if(buy<price[i]){
                int profit = price[i] - buy;
                maxprofit = Math.max(profit, maxprofit);
            }
            else{
                buy = price[i];
            }
        }
        if(maxprofit <0){
            return 0;
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int price[] = {7,6,1,3,5,8,2};
        System.out.println("Max profit :" +profit(price));
    }
}
