
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int res=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1])
                 res+=prices[i]-prices[i-1];
        }
        return res;
    }
}
