class Solution {
    public boolean possible(int[] piles, int h, int k){
        int c = 0;
        for(int i = 0; i<piles.length; i++){
            c += (int)(Math.ceil((double)piles[i]/k));
        }
        if(c <= h){
            return true;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int i = 0; i<piles.length; i++){
            if(piles[i] > r){
                r = piles[i];
            }
        }
        while(l <= r){
            int mid = (l+r)/2;
            if(possible(piles, h, mid)){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}