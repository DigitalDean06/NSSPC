package past_year_papers._2021.preliminary;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        n %= 9;
        System.out.println(n == 0 ? 9 : n);
    }
}
