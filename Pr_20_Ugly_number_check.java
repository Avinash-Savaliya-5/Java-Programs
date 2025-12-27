import java.util.*;
public class Pr_20_Ugly_number_check{
    public boolean uglyCheck(int num){
        if(num < 1){
            return false;
        }
        while(num%2==0){
            num=num/2;
        }
        while(num%3==0){
            num=num/3;
        }
        while(num%5==0){
            num=num/5;
        }
        if(num==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Pr_20_Ugly_number_check obj = new Pr_20_Ugly_number_check();

        boolean ans = obj.uglyCheck(num);
        if(ans == true){
            System.out.println(num + " is ugly number");
        }
        else{
            System.out.println(num + " is not ugly number");
        }

    }
}