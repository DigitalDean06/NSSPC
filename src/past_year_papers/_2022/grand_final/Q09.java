package past_year_papers._2022.grand_final;

import java.util.Arrays;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int g = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();
        Leg[] legs = new Leg[n];
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int row = parts[0].charAt(0) - 'A';
            int column = Integer.parseInt(parts[1]);
            int value = Integer.parseInt(parts[3]);
            legs[i] = new Leg(row, column, value);
        }
        scanner.close();
        Leg[] bottomToTop = Arrays.stream(legs).sorted((o1, o2) -> o2.row - o1.row).toArray(Leg[]::new);
        int i = p;
        int value = g;
        for (Leg leg : bottomToTop) {
            if (i == leg.column || i == leg.column + 1) {
                if (i == leg.column) i++;
                else if (i == leg.column + 1) i--;
                value += leg.value;
            }
        }
        System.out.printf("%d %d%n", i, value);
    }

    public static class Leg {
        public final int row, column, value;

        public Leg(int row, int column, int value) {
            this.row = row;
            this.column = column;
            this.value = value;
        }
    }
}
