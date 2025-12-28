import java.util.*;
public class Pr_23_Pronic_number_check{
    public boolean pronicCheck(int num){
        int i=0;
        while(i*(i+1)<=num){
            if(i*(i+1) == num){
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }

    public boolean pronicCheck02(int num){
        for(int i=1; i<=num/2; i++){
            if(num%i==0 && num%(i+1)==0){
                return true;
            }
            if(i*(i+1)>num){
                return false;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        Pr_23_Pronic_number_check obj_23 = new Pr_23_Pronic_number_check();

        boolean ans = obj_23.pronicCheck(num);
        boolean ans2 = obj_23.pronicCheck02(num);

        if(ans == true){
            System.out.println(num+" is pronic number");
        }
        else{
            System.out.println(num+" is not pronic number");
        }
        if(ans2 == true){
            System.out.println(num+" is pronic number");
        }
        else{
            System.out.println(num+" is not pronic number");
        }

    }
}
