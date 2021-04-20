package leetcode._4_findnumberin2darray;

/**
 * <a href="https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/">剑指 Offer 04. 二维数组中的查找</a>
 */
public class FindNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows    = matrix.length;
        int columns = matrix[0].length;
        int row     = 0;
        int column  = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (target > num) {
                row++;
            } else if (target < num) {
                column--;
            } else {
                return true;
            }
        }
        return false;
    }
}
