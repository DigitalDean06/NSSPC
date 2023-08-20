package past_year_papers._2023.preliminary;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthday = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        System.out.printf("C%d%n", birthday % n + 1);
    }
}
