import java.util.*;
public class Pr_16_Max_min_avg_without_array {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        
        System.out.print("Enter 1 number : ");
        int n1 = sc.nextInt();
        int min = n1;
        int max = n1;
        sum = n1;
        int n;
        for(int i=2; i<=num; i++){
            System.out.print("Enter "+i+" number : ");
            n = sc.nextInt();
            max = Math.max(max, n);
            min = Math.min(min, n);
            sum += n;
        }
        System.out.println("Maximum : " + max);
        System.out.println("Minumum : " + min);
        System.out.println("Average : " + (double)sum/num);
    }
}
