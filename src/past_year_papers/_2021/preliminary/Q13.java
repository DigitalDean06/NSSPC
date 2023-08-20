package past_year_papers._2021.preliminary;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        double finalScore = (arr[2] + arr[3] + arr[4]) / 3.0;
        System.out.printf("%.2f%n", finalScore);
    }
}
