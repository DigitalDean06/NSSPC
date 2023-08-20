package past_year_papers._2022.grand_final;

import java.util.Arrays;
import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        if (Arrays.stream(words).anyMatch(s -> s.length() % 5 != 0)) {
            System.out.println("No valid message");
            return;
        }
        for (int j = 0; j < words.length; j++) {
            String processed = getProcessed(words[j]);
            String result = "";
            for (int i = 0; i < processed.length(); i++) {
                char c = processed.charAt(i);
                if (c == '1') {
                    result += (char) Integer.parseInt(processed.substring(i, i + 3));
                    i += 3 - 1;
                } else {
                    result += (char) Integer.parseInt(processed.substring(i, i + 2));
                    i += 2 - 1;
                }
            }
            String resultResult = "";
            for (char c : result.toCharArray()) if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ') resultResult += c;
            if (j > 0) System.out.print(" ");
            System.out.print(resultResult);
        }
        System.out.println();
    }

    private static String getProcessed(String word) {
        String buffer = "";
        for (int i = 0; i < word.length(); i += 5) {
            String toBeDecrypted = word.substring(i, i + 5);
            int value;
            if (toBeDecrypted.startsWith(".")) value = toBeDecrypted.replace("-", "").length();
            else {
                String replaced = toBeDecrypted.replace(".", "");
                if (replaced.length() == 5) value = 0;
                else value = 5 + replaced.length();
            }
            buffer += String.valueOf(value);
        }
        return buffer;
    }
}
