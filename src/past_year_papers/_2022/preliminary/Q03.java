package past_year_papers._2022.preliminary;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double value = Double.parseDouble(input.substring(0, input.length() - 1));
        if (input.charAt(input.length() - 1) == 'C') System.out.printf("%.1fF%n", value * 9 / 5 + 32);
        else System.out.printf("%.1fC%n", (value - 32) * 5 / 9);
    }
}
