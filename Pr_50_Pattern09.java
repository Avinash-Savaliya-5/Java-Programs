
import java.util.Scanner;

public class Pr_50_Pattern09 {

    public static void draw(int n) {
        int value = n;
        for (int i = 1; i < n; i++) {
            value = n;
            for (int j = 1; j <= n; j++) {

                if (i - j > 0) {
                    System.out.print(value + " ");
                    value--;
                } else {
                    System.out.print(value + " ");
                }
            }
            value = n+1-i;
            for(int j=2; j<=n; j++){
                if(i+j > n){
                    System.out.print(value + " ");
                    value++;
                }
                else{
                    System.out.print(value + " ");
                }
            }

            System.out.println("");
        }
        for(int i=n; i>=1; i--){
            System.out.print(i + " ");
        }
        for(int i=2; i<=n; i++){
            System.out.print(i + " ");
        }
        System.out.println("");
        for(int i=2; i<=n; i++){
            value=n;
            for(int j=1; j<=n; j++){
                if(i+j <= n){
                    System.out.print(value+" ");
                    value--;
                }
                else{
                    System.out.print(value + " ");
                }
            }
            value = i;
            for(int j=2; j<=n; j++){
                if(j>=i){
                    System.out.print(value + " ");
                    value++;
                }
                else{
                    System.out.print(value + " ");
                }
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
