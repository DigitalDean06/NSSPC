package past_year_papers._2022.preliminary;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dx = scanner.nextDouble();
        double dy = scanner.nextDouble();
        double w = scanner.nextDouble();
        double v = scanner.nextDouble();
        double r = (w - dy * v) / (v * (dx - dy));
        if (r < 0 || r > 1) {
            System.out.println("Invalid Input");
            return;
        }
        double r2 = 1 - r;
        System.out.printf("%.2f %.2f%n", r * 100, r2 * 100);
    }
}
