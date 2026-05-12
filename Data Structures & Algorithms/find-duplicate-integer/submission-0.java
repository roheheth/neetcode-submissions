class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        HashSet<Integer> num = new HashSet<>();

        for(int i = 0; i<len; i++){
            num.add(nums[i]);
            if(num.size() != i+1){
                return nums[i];
            }
        }
        return 0;
    }
}
