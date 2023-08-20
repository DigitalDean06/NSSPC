package past_year_papers._2021.preliminary;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = 2 * 3.14 * radius * (height + radius);
        System.out.printf("%.2f%n", area);
    }
}
