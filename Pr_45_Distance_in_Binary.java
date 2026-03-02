public class Pr_45_Distance_in_Binary{
    public static String decimalToBinary(int num){
        String ans = "";
        while(num > 0){
            int rem = num / 2;
            if(rem == 0){
                ans = "0" + ans;
            }
            else{
                ans = "1"+ans;
            }
            num /= 2;
        }
        return ans;
    }
    public static int distanceInBinary(int num1, int num2){
        String str1 = decimalToBinary(num1);
        String str2 = decimalToBinary(num2);
        int len1 = str1.length();
        int len2 = str2.length();
        int ans = Math.abs(len1-len2);

        return 0;


    }

}