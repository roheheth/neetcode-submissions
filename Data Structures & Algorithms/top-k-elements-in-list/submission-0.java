class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                int newValue = map.get(nums[i])+1;
                map.put(nums[i], newValue);
            }
        }
        List<Integer> lst = new ArrayList<>(map.keySet());
        lst.sort((a,b) -> map.get(b) - map.get(a));
        int[] arr = new int[k];
        for(int i = 0; i<k; i++){
            arr[i] = lst.get(i);
        }
        return arr;
    }
}
