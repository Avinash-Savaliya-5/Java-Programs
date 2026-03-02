
import java.util.*;

public class Pr_46_Nth_Digit_Of_Infinite_Integer_Sequence {

    public static int findLength(int n) {
        int ans = 0;
        while (n > 0) {
            ans++;
            n /= 10;
        }
        return ans;

    }

    public static int nthDigit(int n) {
        if (n <= 9) {
            return n;
        }
        int count = 0;
        int i = 1;
        while (count < n) {
            if (count + findLength(i) > n) {
                String s1 = Integer.toString(i);

                char c1 = s1.charAt(count + findLength(i) - n - 1);
                return c1 - 48;
            }
            if (count + findLength(i) == n) {
                String s1 = Integer.toString(i);
                char c1 = s1.charAt(s1.length() - 1);
                return c1 - 48;
            } 
            else {
                count += findLength(i);
                i++;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(nthDigit(n));

    }
}
