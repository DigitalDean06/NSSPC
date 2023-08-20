package past_year_papers._2022.preliminary;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String rearranged = String.valueOf(input.charAt(1)) + input.charAt(3) + input.charAt(2) + input.charAt(0);
        int value = Integer.parseInt(rearranged);
        int result = 1;
        for (int i = 0; i < 4; i++) {
            result *= value;
            result %= 1000000;
        }
        System.out.println(result);
    }
}
