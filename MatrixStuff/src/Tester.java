import java.util.Arrays;
public class Tester {
	public static void main(String[] args) {
		int a[][] = {{1,2,-2,0},{-3,4,7,2},{6,0,3,1}}; // 3 * 4
		int b[][] = {{-1,3},{0,9},{1,-11},{4,-5}}; // 4 * 2
		System.out.println(Arrays.deepToString(MatrixMultiplication.multiply(a,b)));
	}
}