class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = nums.length;
        int l = 0;
        int r = nums.length-1;

        while(l <= r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                l = mid+1;
            }else{
                result = mid;
                r = mid-1;
            }
        }
        return result;
    }
}