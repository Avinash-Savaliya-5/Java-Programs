import java.util.*;
public class Pr_17_Matrix_multiplcation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 matrix rows : ");
        int a1 = sc.nextInt();
        System.out.print("Enter 1 matrix cols : ");
        int a2 = sc.nextInt();
        System.out.print("Enter 2 matrix rows : ");
        int a3 = sc.nextInt();
        System.out.print("Enter 2 matrix cols : ");
        int a4 = sc.nextInt();

        if(a2 != a3){
            System.out.println("Invalid : ");

        }
        else{
            int[][] matrix1 = new int[a1][a2];
            int[][] matrix2 = new int[a3][a4];
            int[][] res = new int[a1][a4];

            for(int i=0; i<a1; i++){
                for(int j=0; j<a2; j++){
                    matrix1[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<a3; i++){
                for(int j=0; j<a4; j++){
                    matrix2[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<a1; i++){
                for(int j=0; j<a4; j++){
                    int sum = 0;
                    int a=0;
                    while(a<a2){
                        sum += matrix1[i][a] * matrix2[a][j];
                        a++;
                    }
                    res[i][j] = sum;
                }
            }
            for(int i=0; i<a1; i++){
                for(int j=0; j<a4; j++){
                    System.out.print(res[i][j] + "\t");
                }
                System.out.println();
            }

        }
    }
}
