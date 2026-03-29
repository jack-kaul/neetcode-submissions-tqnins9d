class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int n : nums1) s1.add(n);
        for (int n : nums2) s2.add(n);

        Set<Integer> diff1 = new HashSet<>(s1);
        diff1.removeAll(s2);

        Set<Integer> diff2 = new HashSet<>(s2);
        diff2.removeAll(s1);

        return Arrays.asList(new ArrayList<>(diff1), new ArrayList<>(diff2));
    } // but what if someone does Ctrl+Z, okayy then this is for the streak////
}