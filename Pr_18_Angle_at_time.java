import java.util.*;

public class Pr_18_Angle_at_time {

    public static double find_angle(int hour, int minute){

        hour = hour % 12; 

        double hAngle = (hour * 30) + (minute * 0.5);
        double mAngle = minute * 6;

        double diff = Math.abs(hAngle - mAngle);

        return Math.min(diff, 360 - diff);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour: ");
        int hour = sc.nextInt();

        System.out.print("Enter minute: ");
        int minute = sc.nextInt();

        System.out.println(hour + ":" + minute + " = " + find_angle(hour, minute) + " degree");
    }
}