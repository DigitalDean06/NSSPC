package past_year_papers._2022.preliminary;

import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = scanner.nextDouble();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextDouble();
        int counter = 0;
        while (Arrays.stream(arr).anyMatch(value -> value != 0)) {
            counter++;
            double h = 0;
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    h = arr[i];
                    index = i;
                    break;
                }
            }
            while (h > 0 && index < arr.length) {
                if (arr[index] == h) {
                    arr[index] = 0;
                    h -= x;
                }
                index++;
            }
        }
        System.out.println(counter);
    }
}
