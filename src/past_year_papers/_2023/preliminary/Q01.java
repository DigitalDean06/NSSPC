package past_year_papers._2023.preliminary;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();
        int n = c / d;
        n += n / a * b;
        System.out.println(n);
    }
}
