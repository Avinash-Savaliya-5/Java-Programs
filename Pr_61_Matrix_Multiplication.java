import java.util.Scanner;
public class Pr_61_Matrix_Multiplication{
    public static void matrixMultiplication(int[][] matrix1, int[][] matrix2){
        int[][] ansMatrix = new int[matrix1.length][matrix2[0].length];
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix2[0].length; j++){
                int sumValue=0;
                for(int k=0; k<matrix1[0].length; k++){
                    sumValue += (matrix1[i][k] *matrix2[k][j]);
                }
                ansMatrix[i][j] = sumValue;
            }
        }
        for(int i=0; i<ansMatrix.length; i++){
            for(int j=0; j<ansMatrix[0].length; j++){
                System.out.print(ansMatrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of matrix 1 : ");
        int r1 = sc.nextInt();
        System.out.print("Enter cols of matrix 1 : ");
        int c1 = sc.nextInt();    
        System.out.print("Enter rows of matrix 2 : ");
        int r2 = sc.nextInt();
        System.out.print("Enter cols of matrix 2 : ");
        int c2 = sc.nextInt();
        if(r2!=c1){
            System.out.println("Not valid");
            return;
        }

        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];

        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.print("matrix1["+i+"]["+j+"] = ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                System.out.print("matrix2["+i+"]["+j+"] = ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        matrixMultiplication(matrix1, matrix2);

    }
}