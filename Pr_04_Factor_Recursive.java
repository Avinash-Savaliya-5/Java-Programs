import java.util.*;
public class Pr_04_Factor_Recursive {
    public static int factors(int n){
        int fact = 1;
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factors(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int res = factors(n);
        System.out.println(res);
    }
}
