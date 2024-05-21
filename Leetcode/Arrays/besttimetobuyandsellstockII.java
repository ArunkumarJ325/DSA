package Arrays;
class Solution {
    public int maxProfit(int[] prices) {
   
        int min=prices[0];
        int profit=0;
        int total=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else if(prices[i]-min>profit){
                profit=prices[i]-min;
                total+=profit;
                profit=0;
                min=prices[i];
                
            }
            
        }
        return total;
        
    }
}   
