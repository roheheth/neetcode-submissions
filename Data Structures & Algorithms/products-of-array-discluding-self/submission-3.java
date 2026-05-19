class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int c = 1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            }else{
                c = c * nums[i];
            }
        }
        int[] arr = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            if(zeroCount > 1){
                arr[i] = 0;
            }else if(zeroCount == 1){
                if(nums[i] != 0){
                    arr[i] = 0;
                }else{
                    arr[i] = c;
                }
            }else{
                arr[i] = c/nums[i];
            }
        }
        return arr;
    }
}  
