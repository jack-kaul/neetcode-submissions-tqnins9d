class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxLH[] = new int[n];
        int maxRH[] = new int[n];

        maxLH[0] = height[0];
        maxRH[n-1] = height[n-1];

        for(int i=1; i< n; i++) {
            maxLH[i] = Math.max(maxLH[i-1], height[i]);
            maxRH[n-i-1] = Math.max(maxRH[n-i], height[n-i-1]);
        }

        int rainWater = 0;
        for(int i=0; i<n; i++) {
            int diff = Math.min(maxLH[i], maxRH[i]) - height[i];
            if(diff > 0) {
                rainWater += diff;
            }
        }

        return rainWater;
    }
}
