class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] sumArr = new int[n];

        for(int i = 1; i < n; i++) {
            sumArr[i] = sumArr[i-1] + nums[i];
        }

        int numArrays = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(sumArr[j] - sumArr[i] + nums[i] == k) numArrays+=1;
            }
        }

        return numArrays;
    }
}