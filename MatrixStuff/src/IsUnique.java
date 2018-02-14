public class IsUnique {
static int[][] matrix = {{}};
	public static void main(String arg[]) {
		System.out.println(isUnique(matrix));
	}
	public static boolean isUnique(int[][] a){
		int i=0,j=0,k=0;
		boolean isNull = a.length==0||a[0].length==0 ? true : false;
		if (!isNull) {
		int rows = a.length;
		int columns = a[0].length;
		int ints[] = new int[rows*columns];
				while(i<rows) {
						ints[k] = a[i][j];
						j++;
					if (j==columns) {
						i++;
						j=0;
					}
						k++;
					}
				for (int l = 0; l < ints.length-1; l++) {
			        for (int m = l+1; m < ints.length; m++) {
			             if (ints[l] == ints[m]) {
			                 return false;
			             }
			        }
			    }              
			    return true;
			}
			return true;
		}
	}
