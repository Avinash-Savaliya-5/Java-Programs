import java.util.*;
public class Pr_13_Odd_Even_Without_Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        String str = Integer.toString(num);
        char last = str.charAt(str.length()-1);
        if(last == '2' || last == '4' || last == '6' || last == '8' || last == '0'){
            System.err.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
