class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer, Integer> complements = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(complements.containsKey(nums[i])) {
                result[0] = complements.get(nums[i]); 
                result[1] = i;         
                break;
            } else {
                complements.put(target-nums[i], i);
            }
        }
        return result;
    }
}
