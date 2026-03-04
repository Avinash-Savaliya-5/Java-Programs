import java.util.Scanner;
public class Pr_60_Max_Sum_of_Same_Sum_of_Digits{
    public static int getSum(int num) {
        int ans=0;
        while(num>0){
            int rem = num%10;
            ans += rem;
            num /= 10;
        }
        if(ans < 10){
            return ans;
        }
        return getSum(ans);
    }
    public static int maxSum(int[] arr){
        int n = arr.length;
        int ans = 0;
        int[] nums = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i=0; i<n; i++){
            int sumOfDigits = getSum(arr[i]);
            nums[sumOfDigits]+=arr[i];
        }
        for(int i=1; i<10; i++){
            if(nums[i]>nums[i-1]){
                ans = nums[i];
            }
        }


        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        int ans = maxSum(arr);
        System.out.println(ans);
    }
}
