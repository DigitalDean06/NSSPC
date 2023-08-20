package past_year_papers._2022.preliminary;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        if (input.length() > 100) {
            System.out.println("Invalid Length");
            return;
        }
        int sum = 0;
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int value = c - 'a' + 1;
                if (isPrime(value)) sum += value;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) if (n % i == 0) return false;
        return true;
    }
}
