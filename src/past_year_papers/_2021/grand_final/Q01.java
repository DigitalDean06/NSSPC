package past_year_papers._2021.grand_final;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int candies = m * n;
        int wrappers = candies;
        while (wrappers >= p) {
            wrappers -= p;
            wrappers += q;
            candies += q;
        }
        System.out.println(candies);
    }
}
