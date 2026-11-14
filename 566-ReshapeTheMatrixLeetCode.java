class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int oldR = mat.length;
        int oldC = mat[0].length;
        if (oldR * oldC != r * c) {
            return mat;
        }
        
        int[][] m = new int[r][c];
        int nextR = 0;
        int nextC = 0;

        for (int i = 0; i < oldR; i++) {
            for (int j = 0; j < oldC; j++) {
                m[nextR][nextC] = mat[i][j];
                if (nextC + 1 < c) {
                    nextC++;
                } else {
                    nextC = 0;
                    nextR++;
                }
            }
        }
        return m;
    }
}
