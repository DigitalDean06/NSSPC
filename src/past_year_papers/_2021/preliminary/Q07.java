package past_year_papers._2021.preliminary;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();
        double r = scanner.nextDouble();
        double t = scanner.nextDouble();
        int n = 0;
        while (p < t) {
            p *= 1 + r;
            n++;
        }
        System.out.println(n);
    }
}
