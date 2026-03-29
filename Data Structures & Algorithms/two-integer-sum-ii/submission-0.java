class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left < right) {
            if(target == numbers[left] + numbers[right]) {
                break;
            }
            if(target < numbers[right] + numbers[left]) {
                right--;
            } else if(target > numbers[right] + numbers[left]) {
                left++;
            }
        }

        int[] result = new int[2];
        result[0] = left + 1;
        result[1] = right + 1;
        return result;
    }
}
