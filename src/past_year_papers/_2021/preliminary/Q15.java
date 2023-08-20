package past_year_papers._2021.preliminary;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String symbol = scanner.nextLine();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            for (int j = 0; j < i * 2 + 1; j++) System.out.print(symbol);
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) System.out.print(" ");
            System.out.println(symbol);
        }
    }
}
