import java.util.Scanner;
public class Pr_34_Pattern05{
    public void draw(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=(i*2)-1; j++){
                if(j==1 || j==((i*2)-1)){
                    System.out.print(1+" ");
                }
                else if(i==j){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Pr_34_Pattern05 obj_35 = new Pr_34_Pattern05();
        obj_35.draw(num);

    }
}