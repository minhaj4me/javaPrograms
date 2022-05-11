import java.lang.*;
import java.util.Scanner;

public class AreaOfScalTriangle {
    public static void main(String[] args) {
        int s1, s2, s3;
        float s;
        double area;
        System.out.println("Enter the three sides of a traingle");
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        s = (s1 + s2 + s3) / 2f;
        area = Math.sqrt(s * ((s - s1) * (s - s2) * (s - s3)));
        System.out.println("Area of triangle is : " + area);

    }

}
