class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int res = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int curr = i;
                int count = 1;

            while(set.contains(curr + 1)){
                curr++;
                count++;
            }
            res = Math.max(res, count);
        }
        }
        return res;
    }
}
