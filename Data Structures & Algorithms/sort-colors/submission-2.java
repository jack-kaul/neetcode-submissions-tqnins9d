class Solution {
    public void sortColors(int[] nums) {
        //0 1 2 1 0 1 2 2
        int start=0, end = nums.length-1, i=0;
        while(i <= end) {
            if(nums[i] == 0) {
                swap(nums, start++, i++);
            } else if(nums[i] == 2) {
                swap(nums, i, end--);
            } else {
                i++;
            }
        }
    }

    
private void swap(int[] a, int i, int j) {
    int t = a[i]; a[i] = a[j]; a[j] = t;
}

}