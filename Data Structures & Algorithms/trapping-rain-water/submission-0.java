class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length-1;
        int lmax = height[0], rmax = height[height.length-1];
        int count = 0;
        while(l < r){
            if(lmax < rmax){
                l++;
                lmax = Math.max(height[l], lmax);
                count += lmax - height[l];
            }else{
                r--;
                rmax = Math.max(height[r],rmax);
                count += rmax - height[r];
            }
        }
        return count;
    }
}
