class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> sol = new HashSet<>();
        for(int j=0; j < nums.length; j++) {
            Map<Integer, Integer> complements = new HashMap<>();
            int target = -1*nums[j];
            for(int i=j+1; i < nums.length; i++) {
                if(complements.get(target-nums[i]) != null) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[j]);
                    triplet.add(nums[complements.get(target-nums[i])]);
                    triplet.add(nums[i]);
                    Collections.sort(triplet);
                    sol.add(triplet);
                } else {
                    complements.put(nums[i], i);
                }
            }
        }
        List<List<Integer>> solList = new ArrayList<>(sol);
        return solList;
    }
}
