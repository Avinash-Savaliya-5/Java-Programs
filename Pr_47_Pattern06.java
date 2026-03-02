import java.util.Scanner;
public class Pr_47_Pattern06{
    public static void draw(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        draw(n);
    }

}