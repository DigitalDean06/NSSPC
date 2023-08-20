package past_year_papers._2021.preliminary;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a_0 = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) a_0 = a_0 * 5 + 7;
        System.out.println(a_0);
    }
}
