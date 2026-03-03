import java.util.Scanner;
public class Pr_55_Check_Number_In_Array_Recursion {

    static int n;

    public static int isInArray(int a[], int m) {
        if(n<=0){
            return 0;
        }
        if(a[n-1]==m){
            return 1;
        }
        n--;
        return isInArray(a, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search : ");
        int m = sc.nextInt();

        int ans = isInArray(arr, m);
        if(ans==1){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
