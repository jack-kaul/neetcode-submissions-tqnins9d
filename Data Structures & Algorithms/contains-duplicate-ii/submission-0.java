class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> unique = new HashMap<>();
        for(int i=0; i < nums.length; i++) {
            if(unique.get(nums[i]) != null && i-unique.get(nums[i]) <= k) {
                return true;
            }
            unique.put(nums[i], i);
        }
        return false;
    }
}