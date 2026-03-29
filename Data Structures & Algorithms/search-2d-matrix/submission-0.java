class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r_start = 0, r_end = matrix.length - 1;
        while(r_start <= r_end) {
            int mid = (r_start + r_end)/2;
            if(target == matrix[mid][0]) {
                return true;
            }
            if(target > matrix[mid][0]) {
                r_start = mid + 1;
            } else {
                r_end = mid - 1;
            }
        }
        if(r_end < 0) return false;

        int c_start = 0, c_end = matrix[r_end].length - 1;
        while(c_start <= c_end) {
            int mid = (c_start + c_end) / 2;
            if(target == matrix[r_end][mid]) {
                return true;
            }
            if(target > matrix[r_end][mid]) {
                c_start = mid + 1;
            } else {
                c_end = mid-1;
            }
        }
        return false;
    }
}
