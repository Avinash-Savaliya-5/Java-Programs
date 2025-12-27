import java.util.*;
public class Pr_21_Kaprekar_number_check{
    public boolean kaprekarCheck(int num){
        int num_square = num * num, sum=0;
        String num_str = Integer.toString(num_square);
        int num1, num2;
        int num_pow = 1;
        for(int i=0; i<num_str.length()/2; i++){
            num_pow = num_pow * 10;
        } 
        num1 = num_square / num_pow;
        num2 = num_square % num_pow;
        sum = num1+num2;
        if(sum == num){
            return true;
        }
        if(num_str.length()%2==0){
            return false;
        }
        else{
            num1 = num_square / (num_pow*10);
            num2 = num_square % (num_pow*10);
            sum = num1+num2;
            if(sum == num){
                return true;
            }
            else{
                return false;
            }

        }
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Pr_21_Kaprekar_number_check obj = new Pr_21_Kaprekar_number_check();
        boolean ans = obj.kaprekarCheck(num);
        if(ans==true){
            System.out.println( num +" is kaprekar number");
        }
        else{
            System.out.println(num + " is not kaprekar number");
        }
    }
}
