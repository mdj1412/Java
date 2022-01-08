public class Ex91 {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } }; 
        int[][] b = { { 6, 3, 4 }, { 5, 1, 2 } }; 
        int[][] c = new int[2][3];

        Matrix1 mx = new Matrix1(); 
        System.out.println("행렬 a"); 
        mx.printMatrix(a); 
        System.out.println("행렬 b"); 
        mx.printMatrix(b); 
        System.out.println("행렬 c"); 
        mx.addMatrix(a, b, c); 
        mx.printMatrix(c);
    }
}

class Matrix1 {
    public void printMatrix(int[][] m) {
        for (int[] e : m) {
            for (int h : e) { System.out.print(h + " "); }
            System.out.println();
        }
        System.out.println();
    }
    public void addMatrix(int[][] a, int[][] b, int[][] c) {
        for (int i=0;i<c.length;i++) {
            for (int j=0;j<c[i].length;j++) {
                c[i][j] += a[i][j] + b[i][j];
            }
        }
    }

}