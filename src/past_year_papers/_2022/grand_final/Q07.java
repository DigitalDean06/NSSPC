package past_year_papers._2022.grand_final;

import java.util.Arrays;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        String key = scanner.nextLine();
        String mode = scanner.nextLine();
        if (original.chars().boxed().anyMatch(c -> c < 'A' || c > 'Z') || key.chars().boxed().anyMatch(c -> c < 'A' || c > 'Z') || (!mode.equals("E") && !mode.equals("D"))) {
            System.out.println("Invalid Input");
            return;
        }
        int[] originalValues = original.chars().boxed().map(value -> value - 'A').mapToInt(Integer::intValue).toArray();
        int[] keyValues = new int[originalValues.length];
        for (int i = 0; i < keyValues.length; i++) keyValues[i] = key.charAt(i % key.length()) - 'A';
        if (mode.equals("E")) {
            int[] encrypted = new int[originalValues.length];
            for (int i = 0; i < encrypted.length; i++) encrypted[i] = (originalValues[i] + keyValues[i]) % 26;
            System.out.println(String.join("", Arrays.stream(encrypted).boxed().map(i -> String.valueOf((char) (i + 'A'))).toArray(String[]::new)));
        } else {
            int[] decrypted = new int[originalValues.length];
            for (int i = 0; i < decrypted.length; i++) {
                decrypted[i] = originalValues[i] - keyValues[i];
                if (decrypted[i] < 0) decrypted[i] += 26;
            }
            System.out.println(String.join("", Arrays.stream(decrypted).boxed().map(i -> String.valueOf((char) (i + 'A'))).toArray(String[]::new)));
        }
    }
}
