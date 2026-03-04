import java.util.Scanner;
public class Pr_57_Minimize_Number{
    public static int minimizeNumber(int num){
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;

        while(num > 0){
            int rem = num % 10;
            if(rem==0) zero++;
            else if(rem==1)one++;
            else if(rem==2)two++;
            else if(rem==3)three++;
            else if(rem==4)four++;
            else if(rem==5)five++;
            else if(rem==6)six++;
            else if(rem==7)seven++;
            else if(rem==8)eight++;
            else if(rem==9)nine++;
            num/=10;
        }
        int ans = 0;
        if(zero==0){
            while(one>0){
                ans = (ans*10)+1;
                one--;
            }
            while(two>0){
                ans = (ans*10)+2;
                two--;
            }
            while(three>0){
                ans = (ans*10)+3;
                three--;
            }
            while(four>0){
                ans = (ans*10)+4;
                four--;
            }
            while(five>0){
                ans = (ans*10)+5;
                five--;
            }
            while(six>0){
                ans = (ans*10)+6;
                six--;
            }
            while(seven>0){
                ans = (ans*10)+7;
                seven--;
            }
            while(eight>0){
                ans = (ans*10)+8;
                eight--;
            }
            while(nine>0){
                ans = (ans*10)+9;
                nine--;
            }
        }
        else{
            if(one>0){
                ans +=1;
                one--;
            }
            else if(two>0){
                ans+=2;
                two--;
            }
            else if(three>0){
                ans+=3;
                three--;
            }
            else if(four>0){
                ans+=4;
                four--;
            }
            else if(five>0){
                ans+=5;
                five--;
            }
            else if(six>0){
                ans+=6;
                six--;
            }
            else if(seven>0){
                ans+=7;
                seven--;
            }
            else if(eight>0){
                ans+=8;
                eight--;
            }
            else if(nine>0){
                ans+=9;
                nine--;
            }
            while(zero>0){
                ans*=10;
                zero--;
            }
            while(one>0){
                ans = (ans*10)+1;
                one--;
            }
            while(two>0){
                ans = (ans*10)+2;
                two--;
            }
            while(three>0){
                ans = (ans*10)+3;
                three--;
            }
            while(four>0){
                ans = (ans*10)+4;
                four--;
            }
            while(five>0){
                ans = (ans*10)+5;
                five--;
            }
            while(six>0){
                ans = (ans*10)+6;
                six--;
            }
            while(seven>0){
                ans = (ans*10)+7;
                seven--;
            }
            while(eight>0){
                ans = (ans*10)+8;
                eight--;
            }
            while(nine>0){
                ans = (ans*10)+9;
                nine--;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int ans = minimizeNumber(num);
        System.out.println(ans);

    }
}