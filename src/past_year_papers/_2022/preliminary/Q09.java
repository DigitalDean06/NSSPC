package past_year_papers._2022.preliminary;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() > 25) {
            System.out.println("Invalid Length");
            return;
        }
        input = input.replaceAll("[0-9]|\\(|\\)|·", "");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        String buffer = "";
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                if (!buffer.isEmpty()) set.add(buffer);
                buffer = String.valueOf(c);
            } else buffer += c;
        }
        if (!buffer.isEmpty()) set.add(buffer);
        System.out.println(String.join(" ", set));
        System.out.println(set.size());
    }
}
