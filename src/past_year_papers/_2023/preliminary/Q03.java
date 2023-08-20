package past_year_papers._2023.preliminary;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStudent = scanner.nextInt();
        int groupAmount = scanner.nextInt();
        for (int i = groupAmount; i <= totalStudent; i += groupAmount) {
            if (i > groupAmount) System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();
    }
}
