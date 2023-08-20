package past_year_papers._2022.preliminary;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) System.out.printf("%.7f%n", 2800 * (scanner.nextDouble() + 273.15) / (99 + 273.15));
    }
}
