/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int num = mat.length*mat[0].length;
        if(num != r*c)
            return mat;
        int[][] mat1= new int[r][c];
        int p=0,pi=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                mat1[p][pi]=mat[i][j];
                if(pi==mat1[p].length-1)
                {
                    p++;
                    pi=0;
                }
                else{
                    pi++;
                }
            }
        }
        return mat1;
    }
}
// @lc code=end

