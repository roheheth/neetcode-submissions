class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return dfs(0, 0, nums, target);
    }

    private int dfs(int index, int sum, int[] nums, int target){
        if(index == nums.length){
            return (target == sum) ? 1 : 0;
        }
        int add = dfs(index+1, sum + nums[index], nums, target);
        int subtract = dfs(index+1, sum - nums[index], nums, target);

        return add + subtract;
    }
}
