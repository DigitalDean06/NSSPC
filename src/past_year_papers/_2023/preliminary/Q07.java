package past_year_papers._2023.preliminary;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double horizontalDistance = scanner.nextDouble();
        double angle = scanner.nextDouble();
        scanner.close();
        System.out.printf("%.2f%n", horizontalDistance * Math.tan(angle / 180 * Math.PI) + 1.8);
    }
}
