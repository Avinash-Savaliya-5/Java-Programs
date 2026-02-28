
import java.util.Scanner;

public class Pr_40_Factorial_Iterative_recursive{
    public static int factorial_Iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans = 1;
        while(n >1){
            ans *= n;
            n--;
        }
        
        return ans;

    }

    public static int factorial_Recusive(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial_Recusive(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter number : ");
        int n = sc.nextInt();

        System.out.println("Iterative : " + n +"! = " + factorial_Iterative(n));
        System.out.println("Recursive : " + n + "! = " + factorial_Recusive(n));
        
    }
}