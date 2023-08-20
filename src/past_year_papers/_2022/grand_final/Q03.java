package past_year_papers._2022.grand_final;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        input = input.replaceAll("\"|,|\\?|!", "");
        String[] words = input.split(" ");
        LinkedHashSet<String> set = new LinkedHashSet<>(); // remove duplicates
        for (String word : words) {
            int counter = 0;
            for (char c : word.toCharArray()) if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') counter++;
            if (counter >= 3) set.add(word);
        }
        for (String word : set) System.out.println(word);
        System.out.println(set.size());
    }
}
