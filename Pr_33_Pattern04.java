import java.util.Scanner;
public class Pr_33_Pattern04{
    public void draw(int num) {

    for (int i = 1; i <= num; i++) {

        for (int j = 1; j <= num - i; j++) {
            System.out.print(" ");
        }

        for (int j = i; j >= 1; j--) {
            System.out.print(j);
        }

        for (int j = 2; j <= i; j++) {
            System.out.print(j);
        }

        System.out.println();
    }

    for (int i = num - 1; i >= 1; i--) {

        for (int j = 1; j <= num - i; j++) {
            System.out.print(" ");
        }

        for (int j = i; j >= 1; j--) {
            System.out.print(j);
        }

        for (int j = 2; j <= i; j++) {
            System.out.print(j);
        }

        System.out.println();
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Pr_33_Pattern04 obj_33 = new Pr_33_Pattern04();
        obj_33.draw(num);
    }
}