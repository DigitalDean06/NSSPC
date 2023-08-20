package past_year_papers._2021.grand_final;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] coefficients = new double[n + 1];
        for (int i = 0; i < n + 1; i++) coefficients[i] = scanner.nextDouble();
        double[] derivation = new double[coefficients.length - 1];
        for (int i = 0; i < derivation.length; i++) derivation[i] = coefficients[i] * (n - i);
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            double q = scanner.nextDouble();
            double s = scanner.nextDouble();
            int signum = (int) Math.signum(eval(coefficients, q));
            double value = q;
            while (Math.signum(eval(coefficients, value)) == signum) value += Math.signum(s - q);
            value--;
            String string;
            do {
                string = String.format("%.7f", value);
                value = value - eval(coefficients, value) / eval(derivation, value);
            } while (!String.format("%.7f", value).equals(string));
            System.out.println(string);
        }
    }

    public static double eval(double[] arr, double value) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) sum += Math.pow(value, arr.length - i - 1) * arr[i];
        return sum;
    }
}
