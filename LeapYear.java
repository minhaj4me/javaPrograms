import java.util.Scanner;
import java.util.concurrent.FutureTask;

/**
 * LeapYear
 */
public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Enter a year to check wheter a year is leap year or not");
        Scanner sc = new Scanner(System.in);
        short year = sc.nextShort();
        if (year % 400 == 0)
            System.out.println("Leap Year");

        if (year % 100 == 0 && year % 400 != 0)
            System.out.println("Not a Leap Year");

    }
}