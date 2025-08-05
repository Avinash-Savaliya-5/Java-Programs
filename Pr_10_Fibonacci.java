import java.util.*;
public class Pr_10_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("0, 1, ");
        int num1 = 0; 
        int num2 = 1;
        int num3 = num1+num2;
        System.out.print(num3 + ", ");
        for(int i=1; i<=num; i++){
            
            num1 = num2;
            num2 = num3;
            num3 = num1+num2;
            System.out.print(num3 + ", ");
        }
    }
}
