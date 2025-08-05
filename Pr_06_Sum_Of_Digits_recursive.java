import java.util.*;
public class  Pr_06_Sum_Of_Digits_recursive{
    public static int sum(int num, int sum){
        
        if(num == 0){
            return sum;
        }
        else{
            int digit = num % 10;
            sum=sum+ digit;
            num=num/10;
        }
        return sum(num, sum);
    }

    public static void main(String[] args) {
        int res = sum(159, 0);
        System.out.println(res);
    }
}
