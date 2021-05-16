import java.util.ArrayList;
import java.util.List;

/**
 * 螺旋矩阵
 */
public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length ==0 || matrix[0].length==0){
            throw new IllegalArgumentException("No this solution");
        }
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        while (left<=right&&top<=bottom){
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (left<=right&&top<=bottom){
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(SpiralMatrix.spiralOrder(matrix).toString());
    }
}
