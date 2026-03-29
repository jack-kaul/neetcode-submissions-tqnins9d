class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        for(int num: nums) {
            elements.add(num);
        }
        if (nums.length == elements.size()) return false;
        else return true;
    }
}