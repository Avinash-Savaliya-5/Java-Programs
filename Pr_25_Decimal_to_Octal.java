import java.util.*;
public class Pr_25_Decimal_to_Octal{
    public String decimalToOctal(int decimal){
        String octal = "";
        if(decimal == 0){
            return "0";
        }
        while(decimal>0){
            octal = octal + Integer.toString(decimal%8);
            decimal = decimal/8;
        }
        String r_octal = "";
        for(int i=octal.length()-1; i>=0; i--){
            r_octal = r_octal + octal.charAt(i);
        }
        return r_octal;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal: ");
        int num = sc.nextInt();
        Pr_25_Decimal_to_Octal obj_25 = new Pr_25_Decimal_to_Octal();
        String ans = obj_25.decimalToOctal(num);

        System.out.println("Decimal: "+num + " to octal: "+ans);
    }
}
