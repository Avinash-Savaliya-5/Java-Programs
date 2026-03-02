import java.util.Scanner;

public class Pr_44_Binary_to_Decimal{
    public static String decimal_to_binary(int num){
        String ans = "";
        while(num > 0){
            int rem = num%2;
            if(rem==0){
                ans = "0" + ans;
            }
            else{
                ans = "1" + ans;
            }
            num /=2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Binary of "+n+" = "+decimal_to_binary(n));
    }
}