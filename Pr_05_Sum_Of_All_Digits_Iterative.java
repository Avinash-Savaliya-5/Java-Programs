import java.util.*;
public class Pr_05_Sum_Of_All_Digits_Iterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0){
            sum += (num % 10);
            num /= 10;
        }
        System.out.println(Math.abs(sum));
    }
}
