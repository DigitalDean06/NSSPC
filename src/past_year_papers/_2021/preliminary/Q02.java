package past_year_papers._2021.preliminary;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double time = Math.sqrt(2 * height / 9.8);
        System.out.printf("%.2f%n", time);
    }
}
