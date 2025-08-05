import java.util.*;
public class Pr_07_Factor_iterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for(int i=1; i<=num/2; i++){
            if(num % i == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println(num);
    }
}
