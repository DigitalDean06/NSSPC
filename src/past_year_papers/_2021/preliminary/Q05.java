package past_year_papers._2021.preliminary;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++) if (scanner.nextInt() % 2 == 0) counter++;
        System.out.println(counter);
    }
}
