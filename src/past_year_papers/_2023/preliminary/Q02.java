package past_year_papers._2023.preliminary;

import java.util.HashSet;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<String> set = new HashSet<>();
        scanner.nextLine();
        for (int i = 0; i < n; i++) set.add(scanner.nextLine());
        scanner.close();
        int value = 1;
        for (int i = 2; i <= set.size(); i++) value *= i;
        System.out.println(value);
    }
}
