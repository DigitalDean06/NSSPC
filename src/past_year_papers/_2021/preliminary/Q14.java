package past_year_papers._2021.preliminary;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int q = (y - 2 * x) / 2;
        int p = x - q;
        if (y % 2 != 0 || p < 0 || q < 0) {
            System.out.println("No feasible solution");
            return;
        }
        System.out.println(p);
        System.out.println(q);
    }
}
