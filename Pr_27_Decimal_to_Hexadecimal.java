import java.util.*;
public class Pr_27_Decimal_to_Hexadecimal{
    public String decimalToHexadecimal(int decimal){
        if(decimal == 0){
            return "0";
        }
        String hexa_decimal = "";
        while(decimal > 0){
            int rem = decimal % 16;
            if(rem < 10){
                hexa_decimal = hexa_decimal + rem;
            }
            else{
                char c = (char)(rem + 55);
                hexa_decimal = hexa_decimal + c;
            }
            decimal= decimal / 16;
        }
        String ans_str = "";
        for(int i=hexa_decimal.length()-1; i>=0; i--){
            ans_str = ans_str + hexa_decimal.charAt(i);
        }
        return ans_str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        Pr_27_Decimal_to_Hexadecimal obj_27 = new Pr_27_Decimal_to_Hexadecimal();
        String ans = obj_27.decimalToHexadecimal(decimal);

        System.out.println("Decimal: " + decimal+" to Hexa-decimal: " + ans);

    }
}