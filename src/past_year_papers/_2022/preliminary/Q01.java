package past_year_papers._2022.preliminary;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if (x < 0 || y < 0 || x % 1 != 0 || y % 1 != 0) {
            System.out.println("Invalid Input");
            return;
        }
        int sum = 0;
        for (int i = (int) Math.min(x, y); i <= Math.max(x, y); i++) if (i % 2 == 0) sum += i;
        System.out.println(sum);
    }
}
