package past_year_papers._2023.preliminary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.close();
        String[] words = input.toLowerCase().replaceAll("[!?,.]", "").split(" ");
        Set<String> set = Arrays.stream(words).collect(Collectors.toSet());
        System.out.println(set.size());
        HashMap<String, Integer> map = new HashMap<>();
        String s;
        for (String word : words) map.put(s = word, map.getOrDefault(s, 0) + 1);
        System.out.println(map.values().stream().filter(integer -> integer >= n).toArray().length);
    }
}
