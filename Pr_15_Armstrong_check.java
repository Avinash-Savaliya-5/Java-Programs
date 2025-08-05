import java.util.*;
public class Pr_15_Armstrong_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int temp = num;
        int power = 0;
        while(temp != 0){
            power++;
            temp /= 10;
        }
        temp = num;
        int sum = 0;
        while(temp != 0){
            int rem = temp % 10;
            sum += (int)Math.pow(rem, power);
            temp /= 10;

        }
        if(sum == num){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }    
}
