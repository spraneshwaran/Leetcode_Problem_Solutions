class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int total_profit=0;
        for(int i=1;i<prices.length;i++){
            int profit=0;
            if(buy>prices[i]){
                buy=prices[i];
            }
            profit=prices[i]-buy;
            if(profit!=0){
                total_profit+=profit;
                buy=prices[i];
            }
        }
        return total_profit;
    }
}