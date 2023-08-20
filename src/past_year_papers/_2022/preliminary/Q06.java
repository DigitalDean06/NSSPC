package past_year_papers._2022.preliminary;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p = 1;
        double q = -2 - m;
        double r = -3 - c;
        double det = q * q - 4 * p * r;
        if (det == 0) System.out.println("One intersection");
        else if (det > 0) System.out.println("Two intersections");
        else {
            System.out.println("No intersection");
            return;
        }
        System.out.printf("%.7f, %.7f%n", (-q + Math.sqrt(det)) / (2 * p), m * (-q + Math.sqrt(det)) / (2 * p) + c);
        System.out.printf("%.7f, %.7f%n", (-q - Math.sqrt(det)) / (2 * p), m * (-q - Math.sqrt(det)) / (2 * p) + c);
    }
}
