class Solution {
    public int numDecodings(String s) {
        if(s.length() == 0){
            return 1;
        }
        if(s.charAt(0) == '0')return 0;

        int n = s.length()+1;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i<n; i++){
            if(isValid(s.substring(i-1,i))){
                dp[i] += dp[i-1];
            }
            if(isValid(s.substring(i-2, i))){
                dp[i] += dp[i-2];
            }
        }
        return dp[n-1];
    }
    public boolean isValid(String s){
        if(s.charAt(0) == '0')return false;

        int n = Integer.parseInt(s);
        return n > 0 && n < 27;
    }
}
