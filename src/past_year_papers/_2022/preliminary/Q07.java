package past_year_papers._2022.preliminary;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();
        double q = scanner.nextDouble();
        double r = scanner.nextDouble();
        double s = (p + q + r) / 2;
        if (Math.max(Math.max(p, q), r) >= s) {
            System.out.println("Invalid");
            return;
        }
        if (p == q && q == r) System.out.println("Equilateral Triangle");
        else if (p == q || q == r || p == r) System.out.println("Isosceles Triangle");
        else System.out.println("Scalene Triangle");
        System.out.println(Math.round(Math.sqrt(s * (s - p) * (s - q) * (s - r))));
    }
}
