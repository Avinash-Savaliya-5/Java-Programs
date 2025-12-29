
import java.util.Scanner;

public class Pr_32_Pattern03{
    public void draw(int num){
        for(int i=1; i<= num; i++){
            for(int j=1; j<=num; j++){
                if(i==1 || i==num){
                    System.out.print("* ");
                }
                else{
                    if((i==j) || ((i+j) == (num+1))){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Pr_32_Pattern03 obj_32 = new Pr_32_Pattern03();        
        obj_32.draw(num);
    }
}