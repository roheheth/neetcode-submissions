class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(list, subset, 0, nums);
        return list;
    }

    public void dfs(List<List<Integer>> list, List<Integer> subset, int index, int[] nums){
        if(index >= nums.length){
            list.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        dfs(list, subset, index+1, nums);
        subset.remove(subset.size()-1);
        dfs(list, subset, index+1, nums);
    }
}
