class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        sum[0] = nums[0];

        for(int i=1; i<n; i++) {
            sum[i] = sum[i-1] + nums[i];
        }

        if(sum[n-1] < target) return 0;
        
        int min=n;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(sum[j]-sum[i] + nums[i] >= target && j-i+1 < min) {
                    min = j-i+1;
                }
            }
        }

        return min;
    }
}