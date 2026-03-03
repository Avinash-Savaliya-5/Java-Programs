
import java.util.Scanner;

public class Pr_53_Insert_in_Array_at_given_Position {

    public static int[] insertAtPosition(int[] nums, int position, int value) {
        int temp1 = nums[position];
        nums[position] = value;
        for (int i = position + 1; i < nums.length; i++) {
            int temp2 = nums[i];
            nums[i] = temp1;
            temp1 = temp2;
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("arr["+i + "] = " +arr[i]);
        }
        System.out.print("Enter position : ");
        int position = sc.nextInt();
        if (position > n) {
            System.out.println("Out of bound");
        } else {
            System.out.print("Enter value : ");
            int value = sc.nextInt();
            arr = insertAtPosition(arr, position, value);
            System.out.println("------------New------------");
            for (int i = 0; i < arr.length; i++) {
                System.out.println("arr["+i+"] = "+arr[i]);
            }
        }

    }
}
