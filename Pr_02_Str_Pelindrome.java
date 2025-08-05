import java.util.*;
public class Pr_02_Str_Pelindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string : ");
        String str = sc.next();
        str = str.toLowerCase();
        
        String str2 = "";
        for(int i=str.length()-1; i>=0; i--){
            str2 = str2 + str.charAt(i);
        }
        if(str.equals(str2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }    
}
