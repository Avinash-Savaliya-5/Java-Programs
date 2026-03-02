import java.util.Scanner;
public class Pr_49_Pattern08{

    public static void draw(int n){
        for(int i=1; i<=(2*n)-1; i++){
            System.out.print("*");
        }
        System.out.println("");
        for(int i=2; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            for(int j=1; j<=((i-1)*2)-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Hii");
        draw(n);
    }
}