import java.util.Scanner;

public class Pr_39_Pattern07{
    public static void draw(int num){
        for(int i=1; i<=(num*2)-1; i++){
            for(int j=1; j<=(2*num)-1; j++){
                if(i==1 || i==(num*2)-1 || j==1 || j==(num*2)-1){
                    System.out.print(num + " ");
                }
                else if(num-i != num-j){
                    
                }
                else if(num-j == num-i){
                    System.out.print(num -i+ " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        draw(num);
    }
}