package past_year_papers._2021.grand_final;

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[8];
        for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextDouble();
        System.out.printf("%.2f%n", findMin(arr, 0));
    }

    public static double findMin(double[] arr, int n) {
        if (n == arr.length) {
            if (arr[0] + arr[1] + arr[2] >= 80) arr[3] /= 2;
            if (arr[4] + arr[5] + arr[6] >= 80) arr[7] /= 2;
            return Arrays.stream(arr).boxed().reduce(0.0, Double::sum);
        }
        double min = Double.MAX_VALUE;
        for (int i = n; i < arr.length; i++) {
            double[] copy = Arrays.copyOf(arr, arr.length);
            double temp = copy[n];
            copy[n] = copy[i];
            copy[i] = temp;
            min = Math.min(min, findMin(copy, n + 1));
        }
        return min;
    }
}
