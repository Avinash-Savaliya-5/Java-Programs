import java.util.Scanner;
public class Pr_59_Check_Array_Ascending_Occurance_3{
    public static boolean validateArray(int[] arr){
        int n = arr.length;
        int count=1;
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                if(count<3){
                    return false;
                }
                else{
                    count = 1;
                }
            }
        }
        if(count < 3){
            return false;
        }

        return true;
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

        boolean ans = validateArray(arr);
        if(ans==true){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
