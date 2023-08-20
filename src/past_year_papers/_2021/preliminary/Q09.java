package past_year_papers._2021.preliminary;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(lcm(lcm(p, q), r));
    }

    public static int lcm(int p, int q) {
        return p * q / gcd(p, q);
    }

    public static int gcd(int p, int q) {
        if (Math.min(p, q) == 0) return Math.max(p, q);
        else return gcd(Math.abs(p - q), Math.min(p, q));
    }
}
