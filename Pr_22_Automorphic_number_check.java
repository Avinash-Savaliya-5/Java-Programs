import java.util.*;
public class Pr_22_Automorphic_number_check{
    public boolean AutomorphicCheck(int num){
        int num_square = num*num;
        while(num > 0){
            if(num % 10 != num_square%10){
                return false;
            }
            else{
                num = num/ 10;
                num_square = num_square/10;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Pr_22_Automorphic_number_check obj_22 = new Pr_22_Automorphic_number_check();
        boolean ans = obj_22.AutomorphicCheck(num);
        if(ans == true){
            System.out.println(num + " is automorphic number");
        }
        else{
            System.out.println(num + " is not automorphic number");
        }
    }
}
