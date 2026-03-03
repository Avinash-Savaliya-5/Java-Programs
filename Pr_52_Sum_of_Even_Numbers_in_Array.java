import java.util.Scanner;
public class Pr_52_Sum_of_Even_Numbers_in_Array{
    public static int sumOfArray(int[] nums){
        int ans = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]%2==0){
                ans += nums[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of enen numbers = "+ sumOfArray(arr));
    }
}