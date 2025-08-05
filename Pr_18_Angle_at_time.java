import java.util.*;
public class Pr_18_Angle_at_time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hour : ");
        int hour = sc.nextInt();
        System.out.print("Enter a minute : ");
        int minute = sc.nextInt();
        
        double mAngle = minute * 6;
        double hAngle = (hour * 30) + (minute * 0.5);

        double angle = Math.abs(hAngle - mAngle);
        angle = Math.min(angle, 360 - angle);
        System.out.println("Angle at " + hour + ":" + minute + " is : "+angle);
    }
}

