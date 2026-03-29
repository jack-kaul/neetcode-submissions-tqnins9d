class NumMatrix {

    int[][] myMatrix;

    public NumMatrix(int[][] matrix) {
        myMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            myMatrix[i] = matrix[i].clone();
        }
        for(int i=0; i< matrix.length; i++) {
            for(int j=1; j < matrix[0].length; j++) {
                myMatrix[i][j] = myMatrix[i][j] + myMatrix[i][j-1];
            }
        }

        for(int i=0; i< matrix[0].length; i++) {
            for(int j=1; j < matrix.length; j++) {
                myMatrix[j][i] = myMatrix[j][i] + myMatrix[j-1][i];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
    int result = myMatrix[row2][col2];

    if (row1 > 0)
        result -= myMatrix[row1 - 1][col2];

    if (col1 > 0)
        result -= myMatrix[row2][col1 - 1];

    if (row1 > 0 && col1 > 0)
        result += myMatrix[row1 - 1][col1 - 1];

    return result;
}
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */