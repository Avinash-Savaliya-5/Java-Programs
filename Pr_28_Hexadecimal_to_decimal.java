import java.util.Scanner;
public class Pr_28_Hexadecimal_to_decimal{
    public void hexaDecimatToDecimal(String hexadecimal){
        if(hexadecimal == null){
            System.out.println("Invalid input");
            return;
        }
        int decimal = 0;
        int mul_num = 1;
        for(int i=hexadecimal.length()-1; i>=0; i--, mul_num*=16){
            if(hexadecimal.charAt(i) >= (char)48 && hexadecimal.charAt(i)<=57){
                int temp = (int)(hexadecimal.charAt(i)-(char)48) * mul_num;
                decimal = decimal + temp; 
            }
            else if(hexadecimal.charAt(i) >= 65 && hexadecimal.charAt(i) <= 70){
                int temp = (int)(hexadecimal.charAt(i)-55) * mul_num;
                decimal = decimal+temp;
            }
                else{
                System.out.println("Invalid input");
                return;
            }    
        }
        System.out.println("Hexa-decimal: "+hexadecimal+" to Decimal: "+decimal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hexa-decimal value: ");
        String hexadecimal = sc.next();

        Pr_28_Hexadecimal_to_decimal obj_28 = new Pr_28_Hexadecimal_to_decimal();
        obj_28.hexaDecimatToDecimal(hexadecimal);
    }
}

