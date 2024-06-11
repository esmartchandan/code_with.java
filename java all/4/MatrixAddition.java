import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixA[][] = new int[3][3];
        int matrixB[][] = new int[3][3];
        int ans[][] = new int[3][3];
	    System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
	    System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ans[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("The ans is: ");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+"\t");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
