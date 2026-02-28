import java.util.Scanner;

public class Pr_41_Power_without_power_multiplication{
    public static int power_without_multiplication(int base, int power) {
    int ans = 1;

    for (int i = 1; i <= power; i++) {
        int temp = 0;
        for (int j = 1; j <= base; j++) {
            temp += ans;
        }

        ans = temp;
    }

    return ans;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.print("Enter power : ");
        int power = sc.nextInt();

        System.out.println(base + " ^ " + power +" = " + power_without_multiplication(base, power));
    }
}