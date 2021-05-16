import java.util.Arrays;

/**
 * 螺旋矩阵2
 */
public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        if (n==0){
            throw new IllegalArgumentException("No solution");
        }
        int[][] result=new int[n][n];
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int num = 1;
        while (left<=right&&top<=bottom){
            for (int i = left; i <= right; i++) {
                result[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                result[bottom][i] = num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                result[i][left] = num++;
            }
            left++;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        Arrays.stream(SpiralMatrixII.generateMatrix(n)).forEach(i->{
            System.out.print("[");
            Arrays.stream(i).forEach(j->{
                System.out.print(j+",");
            });
            System.out.printf("]");
        });
    }
}
