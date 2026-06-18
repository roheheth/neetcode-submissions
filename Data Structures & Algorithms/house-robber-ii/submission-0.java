class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n < 2){
            return nums[0];
        }

        int[] skip_first = new int[n-1];
        int[] skip_last = new int[n-1];

        for(int i = 0; i<n-1; i++){
            skip_first[i] = nums[i+1];
            skip_last[i] = nums[i]; 
        }

        int first_skipped = robber(skip_first);
        int last_skipped = robber(skip_last);
        
        return Math.max(first_skipped, last_skipped);
    }

    public int robber(int nums[]){
        int n = nums.length;
        if(n == 1)return nums[0];
        if(n == 2)return Math.max(nums[0], nums[1]);

        int[] arr = new int[n];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i<n; i++){
            arr[i] = Math.max((nums[i]+arr[i-2]), arr[i-1]);
        }
        return arr[n-1];
    }
}
