class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;

        int l = 1;
        int r = x/2;

        while(l <= r){
            int mid = (l+r)/2;
            long num = (long) mid*mid;

            if(num == x){
                return mid;
            }
            if(num > x){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return r;
    }
}