
import java.util.Scanner;

public class Pr_24_Happy_number_check{
    public boolean happyNumberCheck(int num){
        if(num == 4){
            return false;
        }
        if(num == 1){
            return true;
        }
        int sum=0;
        while(num > 0){
            int rem = num % 10;
            sum = sum + (rem*rem);
            num = num/ 10;
        }
        return happyNumberCheck(sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Pr_24_Happy_number_check obj_24 = new Pr_24_Happy_number_check();
        boolean ans = obj_24.happyNumberCheck(num);

        if(ans){
            System.out.println(num+" is happy number");
        }
        else{
            System.out.println(num + " is not happy number");
        }
    }
}