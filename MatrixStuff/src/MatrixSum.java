import java.util.Arrays;
public class MatrixSum {
	static int[][] matrix1 = {} ;
	static int[][] matrix2 = {} ;
	public static void main(String arg[]) {
		System.out.println(Arrays.deepToString(matrixSum(matrix1, matrix2)));
	}
	public static int[][] matrixSum(int[][] a, int[][] b) {
		int m = a.length==0||a[0].length==0 ? 0 : a.length;
		int n = a.length==0||a[0].length==0 ? 0 : a[0].length;
        int[][] c = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
	}
}
