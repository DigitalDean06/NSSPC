package past_year_papers._2022.grand_final;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        String rna = input.replace("T", "U");
        int startingIndex, endingIndex;
        for (startingIndex = 0; startingIndex < rna.length() - 2; startingIndex++) {
            String current = rna.substring(startingIndex, startingIndex + 3);
            if (current.equals("AUG")) break;
        }
        if (startingIndex == rna.length() - 2) {
            System.out.println(0);
            return;
        }
        for (endingIndex = startingIndex + 3; endingIndex < rna.length() - 2; endingIndex += 3) {
            String current = rna.substring(endingIndex, endingIndex + 3);
            if (current.equals("UAG") || current.equals("UAA") || current.equals("UGA")) {
                endingIndex -= 3;
                break;
            }
        }
        if (endingIndex == rna.length() - 2) {
            System.out.println(0);
            return;
        }
        System.out.println(rna);
        System.out.println(startingIndex + 1);
        int length = (endingIndex - startingIndex) / 3 + 1;
        System.out.println(length);
        for (int i = startingIndex; i <= endingIndex; i += 3) {
            if (i > startingIndex) System.out.print(" ");
            System.out.print(rna.substring(i, i + 3));
        }
        System.out.println();
    }
}
