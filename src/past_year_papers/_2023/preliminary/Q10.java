package past_year_papers._2023.preliminary;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        int value = 0;
        if (input.matches(".*[a-z].*")) value += 26;
        if (input.matches(".*[^A-Za-z0-9].*")) value += 32;
        if (input.matches(".*[A-Z].*")) value += 26;
        if (input.matches(".*[0-9].*")) value += 10;
        System.out.println(value);
        long result = 1;
        for (int i = 0; i < input.length(); i++) result *= value;
        System.out.println(result);
    }
}
