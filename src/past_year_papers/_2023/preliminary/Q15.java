package past_year_papers._2023.preliminary;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String rearranged = "";
        for (int i = 1; i < input.length(); i += 2) rearranged += input.charAt(i);
        for (int i = input.length() % 2 == 0 ? input.length() - 2 : input.length() - 1; i >= 0; i -= 2)
            rearranged += input.charAt(i);
        int value = Integer.parseInt(rearranged.substring(rearranged.length() - 4));
        System.out.println((value * value) % 10000);
    }
}
