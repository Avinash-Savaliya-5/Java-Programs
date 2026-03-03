import java.util.Scanner;
public class Pr_51_Pattern10{
    public static void draw(int n){
        int value=1;
        for(int i=1; i<(2*n)-1; i++){
            if(i > 2 && i %2==0){
                continue;
            }
            for(int j=1; j<=i; j++){
                value = j;
                if(j%2==1){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print("* ");
                }
            }
            for(int j = value-1; j>=1; j--){
                if(j%2==1){
                    System.out.print(j + " ");
                }
                else{
                    System.out.print("* ");
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