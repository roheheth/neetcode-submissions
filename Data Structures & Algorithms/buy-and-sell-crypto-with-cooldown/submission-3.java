class Solution {

    Integer[][] dp;

    public int maxProfit(int[] prices) {
        dp = new Integer[prices.length][2];
        return dfs(0, true, prices);
    }

    public int dfs(int day, boolean buying, int[] prices) {

        if (day >= prices.length)
            return 0;

        int state = buying ? 1 : 0;

        if (dp[day][state] != null)
            return dp[day][state];

        if (buying) {

            int buy =
                    -prices[day]
                    + dfs(day + 1, false, prices);

            int skip =
                    dfs(day + 1, true, prices);

            return dp[day][state] =
                    Math.max(buy, skip);

        } else {

            int sell =
                    prices[day]
                    + dfs(day + 2, true, prices);

            int hold =
                    dfs(day + 1, false, prices);

            return dp[day][state] =
                    Math.max(sell, hold);
        }
    }
}