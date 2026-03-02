
import java.util.Scanner;

public class Pr_43_Decimal_to_BCD{
    public static String decimal_To_BCD(int n){
        String ans = "";
        while(n > 0){
            int rem = n%10;
            if(rem == 1){
                ans = "0001 " + ans;
            }
            else if(rem==2){
                ans = "0010 " + ans;
            }
            else if(rem == 3){
                ans = "0011 " + ans;
            }
            else if(rem==4){
                ans = "0100 " + ans;
            }
            else if(rem==5){
                ans = "0101 " + ans;
            }
            else if(rem == 6){
                ans = "0110 " + ans;
            }
            else if(rem==7){
                ans = "0111 " + ans;
            }
            else if(rem==8){
                ans = "1000 " + ans;
            }
            else if(rem==9){
                ans = "1001 " + ans;
            }
            n/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("BCD of + "+n+ " = " + decimal_To_BCD(n));



    }
}