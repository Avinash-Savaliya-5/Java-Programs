import java.util.*;
public class Pr_03_Factor_iterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.err.println(n + "! = "+ fact);
    }
}
