import java.util.Scanner;
public class Pr_29_Enter_in_position_in_array{
    public void enterInPosition(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        System.out.print("Enter numnber of elements: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to insert element: ");
        int p = sc.nextInt();
        System.out.print("Enter new element: ");
        if(p<0){
            System.out.println("Invalid input");
        }
        else if(p>=n){
            arr[n] = sc.nextInt();
            System.out.println("Element is inserted after "+ n + " elements");
        }
        else{
            for(int i=n-1; i>=p; i--){
                arr[i+1] = arr[i];
            }
            arr[p] = sc.nextInt();
        }
        for(int i=0; i<=n; i++){
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pr_29_Enter_in_position_in_array obj_29 = new Pr_29_Enter_in_position_in_array();
        obj_29.enterInPosition();
    }

}