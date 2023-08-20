package past_year_papers._2022.preliminary;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";
        boolean changed = false;
        do {
            if (changed) {
                input = result;
                result = "";
                changed = false;
            }
            for (int i = 0; i < input.length(); i++) {
                boolean add = i <= 0 || input.charAt(i - 1) != input.charAt(i);
                if (i < input.length() - 1 && input.charAt(i + 1) == input.charAt(i)) add = false;
                if (add) result += input.charAt(i);
                else changed = true;
            }
        } while (changed);
        System.out.println(result.isEmpty() ? "Empty String" : result);
    }
}
