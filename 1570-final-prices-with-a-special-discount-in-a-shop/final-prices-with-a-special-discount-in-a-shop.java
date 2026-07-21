class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i=0;i<prices.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    min=prices[j];
                    break;
                }
            }
            if(min!=Integer.MAX_VALUE) prices[i]=prices[i]-min;
        }
        return prices;
    }
}