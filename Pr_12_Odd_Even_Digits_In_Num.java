import java.util.*;
public class Pr_12_Odd_Even_Digits_In_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int oddCount = 0;
        int evenCount = 0;
        while(num>0){
            if((num%10)%2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            num /= 10;
        }
        System.out.println("Odds : "+oddCount + "\nEvens : "+ evenCount);


    }
}
