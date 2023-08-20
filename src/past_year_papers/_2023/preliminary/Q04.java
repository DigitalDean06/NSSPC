package past_year_papers._2023.preliminary;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        String input;
        scanner.nextLine();
        for (int i = 0; i < n; i++) map.put(input = scanner.nextLine(), map.getOrDefault(input, 0) + 1);
        int max = map.values().stream().max(Integer::compareTo).orElseThrow();
        System.out.println(map.keySet().stream().filter(s -> map.get(s) == max).sorted().collect(Collectors.joining(" ")));
    }
}
