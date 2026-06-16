class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(nums, res, cur);
        return res;
    }
    public void backtrack(int[] nums, List<List<Integer>> res, List<Integer> cur){
        if(cur.size() == nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int n : nums){
            if(cur.contains(n)){
                continue;
            }
            cur.add(n);
            backtrack(nums, res, cur);
            cur.remove(cur.size()-1);
        }
    }
}
