package past_year_papers._2023.preliminary;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        if (a / b != 1 && x / y == 1) {
            System.out.println(-1);
            return;
        }
        int n = 0;
        while ((a + n) / (double) (b + n) < x / (double) y) n++;
        System.out.println(n);
    }
}
