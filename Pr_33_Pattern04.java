import java.util.Scanner;
public class Pr_33_Pattern04{
    public void draw(int num){
        for(int i=1; i<=(2*num)-1; i++){
            int n=i;
            for(int j=1; j<=(2*num)-1; j++){
                if(j<=(num-i)){
                    System.out.print("  ");
                }
                else{
                    System.out.print(n + " ");
                    n--;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Pr_33_Pattern04 obj_33 = new Pr_33_Pattern04();
        obj_33.draw(num);
    }
}