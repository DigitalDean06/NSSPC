package past_year_papers._2021.preliminary;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int sum = 0;
        for (int i = Math.min(p, q); i <= Math.max(p, q); i++) sum += i;
        System.out.println(sum);
    }
}
