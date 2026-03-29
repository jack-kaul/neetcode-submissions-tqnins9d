class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            merge(nums, left, mid, right);
        }
    }

    public void merge(int[] nums, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] nums1 = new int[n1];
        int[] nums2 = new int[n2];

        for(int i = 0; i< n1; i++) {
            nums1[i] = nums[start + i];
        }

        for(int i = 0; i< n2; i++) {
            nums2[i] = nums[mid+i+1];
        }

        int i = 0, j=0;
        while(i<n1 && j<n2) {
            if(nums1[i] > nums2[j]) {
                nums[start++] = nums2[j++];
            } else {
                nums[start++] = nums1[i++];
            }
        }

        while(i<n1) {
            nums[start++] = nums1[i++];
        }

        while(j<n2) {
            nums[start++] = nums2[j++];
        }
    }
}

