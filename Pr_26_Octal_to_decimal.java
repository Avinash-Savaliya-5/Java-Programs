import java.util.Scanner;
public class Pr_26_Octal_to_decimal{
    public int octalToDecimal(int octal){
        if(octal == 0){
            return 0;
        }
        int pow = 1;
        int decimal = 0;
        while(octal>0){
            int rem = octal % 10;
            decimal = decimal + (rem * pow);
            octal = octal/10;
            pow = pow*8;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal: ");
        int octal = sc.nextInt();

        Pr_26_Octal_to_decimal obj_26 = new Pr_26_Octal_to_decimal();
        int ans = obj_26.octalToDecimal(octal);

        System.out.println("Octal: "+octal+" to decimal: "+ans);

    }
}
