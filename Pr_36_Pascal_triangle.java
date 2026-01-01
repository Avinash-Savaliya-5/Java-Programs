import java.util.Scanner;

class Pr_36_Pascal_triangle {
    public void pascalTriangle(int num){
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            int val = 1;
            for (int j = 1; j <= i; j++) {
                if(val < 10){
                    System.out.print(val + "  ");
                }
                else{
                    System.out.print(val + " ");
                }
                val = val * (i - j) / j;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Pr_36_Pascal_triangle obj_36 = new Pr_36_Pascal_triangle();
        obj_36.pascalTriangle(num);
        
    }
}
