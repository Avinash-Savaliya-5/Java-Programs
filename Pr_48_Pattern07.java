import java.util.*;
public class Pr_48_Pattern07{
    public static void draw(int n){
        for(int i=0; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=((n-i)*2)-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        draw(n);
    }
}
