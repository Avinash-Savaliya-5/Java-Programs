import java.util.*;
public class Pr_12_Odd_Even_Digits_In_Num {
    public static void odd_even_count_in_number(int num){
        int temp = num;
        int oddCount=0;
        int evenCount=0;

        while(temp > 0){
            if((temp % 10) %2 ==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            temp/=10;
        }
        System.out.println("Odd : " + oddCount +"\nEven : " + evenCount);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        odd_even_count_in_number(num);
    }
}
