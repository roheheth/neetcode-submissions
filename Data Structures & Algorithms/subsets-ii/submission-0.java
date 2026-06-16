class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(nums, res, cur, 0);
        return res;
    }

    public void backtrack(int[] nums, List<List<Integer>> res, List<Integer> cur, int i) {
        if (i >= nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        backtrack(nums, res, cur, i + 1);
        cur.remove(cur.size() - 1);
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }
        backtrack(nums, res, cur, i + 1);
    }
}