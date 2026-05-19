
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
                if(prices[i] < min){
                    min = prices[i];
                }
                else if(prices[i] - min > maxProfit){
                    maxProfit = prices[i] - min;
                }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = solution.maxProfit(prices);
        System.out.println(result); // Output: 5
    }
}

