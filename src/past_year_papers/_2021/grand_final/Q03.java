package past_year_papers._2021.grand_final;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toUpperCase().replaceAll("[?!,.\"]", "");
        String[] words = Arrays.stream(string.split(" ")).collect(Collectors.toSet()).toArray(String[]::new);
        Arrays.sort(words);
        System.out.println(words.length);
        Arrays.stream(words).forEach(System.out::println);
    }
}
