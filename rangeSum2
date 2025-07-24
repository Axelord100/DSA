class NumMatrix {

    private int[][] prefix;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        prefix = new int[m + 1][n + 1]; // sum[i][j] is sum of all elements inside the rectangle [0,0,i,j]

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = prefix[i - 1][j] 
                    + prefix[i][j - 1] 
                    - prefix[i - 1][j - 1] 
                    + matrix[i - 1][j - 1];
            }
        }
    }
    public int sumRegion(int r1, int c1, int r2, int c2) {
        r1++; c1++; r2++; c2++; // Since our `sum` starts by 1 so we need to increase r1, c1, r2, c2 by 1
        return prefix[r2][c2] 
            - prefix[r2][c1 - 1] 
            - prefix[r1 - 1][c2] 
            + prefix[r1 - 1][c1 - 1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
