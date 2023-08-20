package past_year_papers._2021.preliminary;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) sum += i;
        System.out.println(sum);
    }
}
