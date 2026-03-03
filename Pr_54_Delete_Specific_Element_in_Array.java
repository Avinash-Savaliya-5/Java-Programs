import java.util.Scanner;
public class Pr_54_Delete_Specific_Element_in_Array{
    public static void deleteElementFromArray(int[] nums, int value){
        int n = nums.length;
        int position = -1;
        for(int i=0; i<n; i++){
            if(nums[i]==value){
                position = i;
                break;
            }
        }
        if(position == -1){
            System.out.println("Element is not found");
        }
        else{
            for(int i=position; i<n-1; i++){
                nums[i] = nums[i+1];
            }
        }
        System.out.println("--------New--------");
        for(int i=0; i<n-1; i++){
            System.out.println("arr["+i+"] = "+nums[i]);
        }
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

        System.out.print("Enter value to delete : ");
        int value = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("arr["+i+"] = "+arr[i]);
        }

        deleteElementFromArray(arr, value);

    }

}