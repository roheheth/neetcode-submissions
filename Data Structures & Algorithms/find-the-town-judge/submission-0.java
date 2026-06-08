class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] truster = new int[n+1];
        int[] trusted = new int[n+1];
        for(int[] pair : trust){
            int a = pair[0];
            int b = pair[1];

            truster[a]++;
            trusted[b]++;
        }
        for(int i = 1; i<n+1; i++){
            if(trusted[i] == n-1 && truster[i] == 0){
                return i;
            }
        }
        return -1;
    }
}