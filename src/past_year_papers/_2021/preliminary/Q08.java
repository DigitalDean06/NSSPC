package past_year_papers._2021.preliminary;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase();
        int counter = 0;
        for (char c : sentence.toCharArray()) if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') counter++;
        System.out.println(counter);
    }
}
