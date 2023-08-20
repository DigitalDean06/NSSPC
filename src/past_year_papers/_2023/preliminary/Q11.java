package past_year_papers._2023.preliminary;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = i + 1; j < i + n; j++)
                if (arr[j % n] > arr[i]) {
                    if (++counter < 2) continue;
                    if (i > 0) System.out.print(" ");
                    System.out.print(arr[j % n]);
                    break;
                }
            if (counter >= 2) continue;
            if (i > 0) System.out.print(" ");
            System.out.print(-1);
        }
        System.out.println();
    }
}
