import java.util.Scanner;
public class Pr_56_Array_Rotate{
    public static void rotateArray(int arr[], int k){
        int n = arr.length;
        while(k > 0){
            int temp = arr[n-1];            
            for(int i=n-2; i>=0; i--){
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
            k--;
        }
        for(int i=0; i<n; i++){
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("arr["+i+"] = "+i);
            arr[i] = i;
        }

        System.out.print("Enter k : ");
        int k = sc.nextInt();

        rotateArray(arr, k);
        
    }
}