import java.util.Scanner;
public class Pr_58_Sum_of_Pairs_Equals_K_in_Array{
    public static int findPairsFromArray(int[] arr, int k){
        int ans = 0;
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==k){
                    ans++;
                }
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
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a number : ");
        int k = sc.nextInt();

        int ans = findPairsFromArray(arr, k);
        System.out.println(ans);
    }
}