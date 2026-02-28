
import java.util.Scanner;

class Pr_42_Reminder_quotient_without_division{
    public static void division_Quotient(int num1, int num2){
        if(num1 == num2){
            System.out.println("Quotient : 1\nReminder : 0");
        }
        int maxNum = (num1 > num2) ? num1 : num2;
        int minNum = (num1 < num2) ? num1 : num2;
        int quotient = 0;

        while(maxNum - minNum>=0){
            quotient++;
            maxNum -= minNum;
        }
        System.out.println("Quotient : " + quotient);
        System.out.println("Reminder : " + (maxNum));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        division_Quotient(num1, num2);
    }

}