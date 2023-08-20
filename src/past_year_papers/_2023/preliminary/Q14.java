package past_year_papers._2023.preliminary;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        try {
            if (n == 1) {
                double x = scanner.nextDouble();
                System.out.printf("%.4f%n", Math.sqrt(3) / 2 * x);
                return;
            }
            if (n == 2) {
                double y = scanner.nextDouble();
                double z = scanner.nextDouble();
                if (isInvalid(y, y, z)) throw new Exception();
                System.out.printf("%.4f%n", Math.sqrt(y * y - z * z / 4));
                return;
            }
            if (n == 3) {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                if (isInvalid(a, b, c)) throw new Exception();
                double s = (a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.printf("%.4f%n", area * 2 / a);
            }
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }

    public static boolean isInvalid(double a, double b, double c) {
        return !(Math.max(Math.max(a, b), c) < (a + b + c) / 2);
    }
}
