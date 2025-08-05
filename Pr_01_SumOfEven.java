import java.util.*;
public class Pr_01_SumOfEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("Sum : " + sum);


    }
}