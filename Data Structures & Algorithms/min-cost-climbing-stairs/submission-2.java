class Solution {
    Integer[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new Integer[cost.length];
        int res = Math.min(dfs(0, cost), dfs(1, cost));
        return res;
    }

    private int dfs(int i, int[] cost){
        if(i >= cost.length) return 0;
        if(dp[i] != null) return dp[i];

        int one = cost[i] + dfs(i+1, cost);
        int two = cost[i] + dfs(i+2, cost);

        return dp[i] = Math.min(one, two);
    }
}
