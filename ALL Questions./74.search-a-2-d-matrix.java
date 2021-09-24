/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            if (target == matrix[i][n - 1]) return true;
            if (target < matrix[i][n - 1]) {
                if (Arrays.binarySearch(matrix[i], 0, n - 1, target) < 0) return false;
                else return true;
            }
        }
        return false;
    }
}
// @lc code=end

