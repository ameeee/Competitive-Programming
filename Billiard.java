import java.util.Scanner;

public class Billiard{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            double a = s.nextDouble();
            double b = s.nextDouble();
            double ss = s.nextDouble();
            double m = s.nextDouble();
            double n = s.nextDouble();
            if (a == 0 && b == 0 && ss == 0 && m == 0 && n == 0) {
                break;
            }
            double angle;
            if (m == 0) {
                angle = 0.0;
            } else if (n == 0) {
                angle = 90.0;
            } else {
                double rad = n / m * b / a;
                angle = Math.toDegrees(Math.atan(rad));

            }
            double velocity = Math.sqrt(a * a * m * m + b * b * n * n) / ss;

            System.out.printf("%.2f %.2f\n", angle, velocity);
        }
    }
}
