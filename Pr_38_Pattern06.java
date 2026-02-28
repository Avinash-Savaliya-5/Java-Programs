import java.util.Scanner;
public class Pr_38_Pattern06{
    public static void draw(int num){
        int count =1;
        for(int i=1; i<=num; i++){
            for(int j=1; j <= num; j++){
                if(i%2==1){
                    if(count < 10){
                        System.out.print(count+"  ");
                    }
                    else{
                        System.out.print(count+" ");
                    }
                    count++;
                }
                else{
                    if(count<10){
                        System.out.print((count+num-j-j+1)+"  ");
                    }
                    else{
                        System.out.print((count+num-j-j+1)+" ");
                    }
                    count++;
                }
            }
            System.out.println();
            }
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        draw(num);
    }
}