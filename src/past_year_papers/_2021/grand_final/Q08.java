package past_year_papers._2021.grand_final;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        double[] arr = new double[n];
        boolean[] mask = new boolean[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.equals("#")) mask[i] = true;
            else arr[i] = Double.parseDouble(input);
        }
        for (int i = 0; i < arr.length; i++) {
            if (mask[i]) {
                int left = i - 1;
                int right = i + 1;
                while (mask[left]) left--;
                while (mask[right]) right++;
                System.out.printf("%.2f%n", arr[left] + (i - left) / (double) (right - left) * (arr[right] - arr[left]));
            }
        }
    }
}
