package past_year_papers._2022.preliminary;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] arr = new int[20];
        int i = 0;
        while (i < 20) {
            int input = scanner.nextInt();
            if (input >= -100 && input <= 100) arr[i++] = input;
        }
        int counter = 0;
        for (int j = 0; j < 20 - 1; j++) {
            for (int k = j + 1; k < 20; k++) {
                if (arr[j] + arr[k] == x) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println(counter);
    }
}
