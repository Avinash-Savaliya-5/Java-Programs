import java.util.Scanner;

public class Pr_31_Pattern02 {

    public void draw(int num) {

        for (int i = 1; i <= num; i++) {
            int n1 = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(n1);
                if (j < i) System.out.print(" * ");
                n1 += 2;
            }
            n1 -= 4;
            for (int j = 1; j < i; j++) {
                System.out.print(" * " + n1);
                n1 -= 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pr_31_Pattern02 obj_31 = new Pr_31_Pattern02();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        obj_31.draw(num);
    }
}
