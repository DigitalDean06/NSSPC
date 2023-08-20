package past_year_papers._2023.preliminary;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() != 18) {
            System.out.println("Invalid input");
            return;
        }
        input = input.toUpperCase();
        try {
            String[] parts = input.split("-");
            if (parts.length != 4) throw new Exception();
            int value = Integer.parseInt(parts[0]);
            if (value < 1 || value > 256) throw new Exception();
            if (!"MTW".contains(String.valueOf(parts[1].charAt(0)))) throw new Exception();
            if (!"IAB".contains(String.valueOf(parts[1].charAt(1)))) throw new Exception();
            if (Integer.parseInt(String.valueOf(parts[2].charAt(0)) + parts[2].charAt(2) + parts[2].charAt(4)) % 3 != 0)
                throw new Exception();
            if ((value = Integer.parseInt(parts[3].substring(2))) <= 18 || value >= 24) throw new Exception();
            System.out.println("Valid");
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }
}
