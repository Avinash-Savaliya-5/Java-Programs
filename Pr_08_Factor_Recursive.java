import java.util.*;
public class Pr_08_Factor_Recursive {
    public static void factors(int num, int t){
        if(t > num){
            return;
        }
        else{
            if(num % t == 0){
                System.out.print(t + ", ");
            }
        }
        factors(num, t+1);

    }
    public static void main(String[] args) {
        factors(50, 1);
    }
}
