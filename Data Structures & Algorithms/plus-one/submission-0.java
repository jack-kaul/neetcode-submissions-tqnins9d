class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1, n = digits.length, curr_sum = 0;
        for(int i = 0; i < n; i++) {
            curr_sum = digits[n-i-1] + carry;
            digits[n-i-1] = curr_sum % 10;
            carry = curr_sum/10;
            curr_sum = 0;
        }
        if(carry > 0) {
            int[] newArr = new int[n + 1];
            for(int i = 0; i < n; i++) {
                newArr[n-i] = digits[n-i-1];
            }
            newArr[0] = carry;
            return newArr;
        } else {
            return digits;
        }
    }
}
