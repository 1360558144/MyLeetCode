package org.zq.exercise;

/**
 * @description:重塑矩阵
 * @author:zq
 * @time:6:44
 */
public class Demo566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c){
            return mat;
        }
        int[][] ans = new int[r][c];
        for(int i = 0;i < m*n;i ++){
            ans[i / c][i % c] = mat[i / n][i % n];
        }
        return ans;
    }
}
