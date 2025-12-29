import java.util.Scanner;
public class Pr_35_Swastika_Pattern06{
    public void draw(int num){
        for(int i=1; i<=(num*2)-1; i++){
            for(int j=1; j<=(num*2)-1; j++){
                if(i==1 && j>= num){
                    System.out.print("*  ");
                }
                else if(i== (num*2)-1 && j<=num){
                    System.out.print("*  ");
                }
                else if(i<=num && j==1){
                    System.out.print("*  ");
                }
                else if(i>=num && j == (num*2)-1){
                    System.out.print("*  ");
                }
                else if(i==num){
                    System.out.print("*  ");
                }
                else if(j==num){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%2==0){
            num+=1;
        }
        Pr_35_Swastika_Pattern06 swastika = new Pr_35_Swastika_Pattern06();
        swastika.draw(num);
    }
}