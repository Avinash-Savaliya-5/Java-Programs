import java.util.*;
public class Pr_14_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number : ");
        int num2 = sc.nextInt();
        boolean isPrime = true;

        for(int i=num1; i<=num2; i++){
            isPrime = true;
            for(int j=2; j<=i/2; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime ==true){
                System.out.println(i);
            }
        }
    }
}
