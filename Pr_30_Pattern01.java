import java.util.*;
public class Pr_30_Pattern01{
    public void draw(int n){
        for (int i = 1; i <= n; i++) {   
            int value = i;              
            System.out.print(value + " ");

            for (int j = 1; j < i; j++) {
                value += (n - j);
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Pr_30_Pattern01 obj_30 = new Pr_30_Pattern01();
        obj_30.draw(num);
    }
}
