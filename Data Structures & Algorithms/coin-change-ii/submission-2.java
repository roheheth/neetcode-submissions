class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,0);
        dp[0] = 1;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<amount+1; j++){
                if(j >= coins[i]){
                        dp[j] = dp[j] + dp[j-coins[i]];
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[amount];
    }
}
