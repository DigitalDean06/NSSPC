package past_year_papers._2023.preliminary;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        if (x % 2 != 0 || y % 2 != 0) {
            System.out.println("Invalid input");
            return;
        }
        int m = y / 2 - x;
        int n = x / 2 - m;
        if (m < 0 || n < 0) {
            System.out.println("Invalid input");
            return;
        }
        System.out.printf("%d %d%n", m, n);
    }
}
