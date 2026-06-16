class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, cur, 0);
        return res;
    }

    public void backtrack(int[] candidates, int target, List<Integer> cur, int i){
        if(target == 0){
            res.add(new ArrayList(cur));
            return;
        }
        if(target < 0){
            return;
        }
        for(int j = i; j<candidates.length; j++){
            if(j > i && candidates[j] == candidates[j-1]){
                continue;
            }
            if(candidates[j] > target){
                break;
            }
            cur.add(candidates[j]);
            backtrack(candidates, target-candidates[j], cur, j+1);
            cur.remove(cur.size()-1);
        }
    }
}
