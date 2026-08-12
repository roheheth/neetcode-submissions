class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
       boolean[] used = new boolean[nums.length];
       dfs(new ArrayList<>(), used, nums);
       return res; 
    }
    public void dfs(List<Integer> list, boolean[] used, int[] nums){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i<nums.length; i++){
            if(used[i]){
                continue;
            }
            list.add(nums[i]);
            used[i] = true;
            dfs(list, used, nums);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }
}
