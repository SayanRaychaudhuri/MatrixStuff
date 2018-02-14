
public class MatrixMultiplication {

	public static int[][] multiply(int a[][], int b[][]) {
		int m1 = a.length;
		int m2 = b.length; // m2 == n1
		int n2 = b[0].length;
	int c[][] = new int[m1][n2]; // 3 * 2
	for (int h = 0; h < m1; h++) {
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                c[h][i] += a[h][j] * b[j][i];
            }
        }
	}
		return c;
	}
}
