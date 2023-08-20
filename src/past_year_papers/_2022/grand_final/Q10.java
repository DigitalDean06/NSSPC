package past_year_papers._2022.grand_final;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double z = scanner.nextDouble();
        ArrayList<Integer> combined = getCombined(z, x, y);
        combined.sort(Integer::compareTo);
        int value = 0;
        for (int i = 0; i < combined.size() - 1; i++) {
            int current = combined.get(i);
            int next = combined.get(i + 1);
            if (next % x == 0 && (next % y != 0 || x > y)) {
                value += next - current;
            }
        }
        double threshold = (combined.get(combined.size() - 1) - z) / 2.0;
        System.out.println(value == threshold ? "Equal" : value > threshold ? "Red" : "Blue");
    }

    private static ArrayList<Integer> getCombined(double z, int x, int y) {
        ArrayList<Integer> red = new ArrayList<>();
        ArrayList<Integer> blue = new ArrayList<>();
        int p = (int) (z + x - 1) / x * x;
        int q = (int) (z + y - 1) / y * y;
        while (red.isEmpty() || blue.isEmpty() || p <= 60 || q <= 60 || red.get(red.size() - 1) < 60 || blue.get(blue.size() - 1) < 60) {
            if (p == q) {
                red.add(p);
                blue.add(q);
                p += x;
                q += y;
            } else if (p < q) {
                red.add(p);
                p += x;
            } else {
                blue.add(q);
                q += y;
            }
        }
        ArrayList<Integer> combined = new ArrayList<>();
        combined.addAll(red);
        combined.addAll(blue);
        combined = new ArrayList<>(new HashSet<>(combined));
        return combined;
    }
}
