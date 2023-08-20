package past_year_papers._2021.preliminary;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextDouble();
        double distance = time / (1 / 22.0 + 1 / 30.0);
        System.out.printf("%.2f%n", distance);
    }
}
