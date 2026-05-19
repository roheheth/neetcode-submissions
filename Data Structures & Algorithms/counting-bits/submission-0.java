class Solution {
    public int bits(int k){
        int count = 0;
        while(k != 0){
            count += (k & 1);
            k >>>= 1;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i = 0; i<=n; i++){
            arr[i] = bits(i);
        }
        return arr;
    }
}
