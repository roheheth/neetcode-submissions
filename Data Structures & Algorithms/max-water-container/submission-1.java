class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = Integer.MIN_VALUE;
        while(left < right){
            int height = Math.min(heights[left], heights[right]);
            if(max < height*(right-left)) max = height*(right-left);
            if(heights[left] > heights[right]){
                right--;
            }else{
                left++;
            }
        }
        return max;
    }
}
