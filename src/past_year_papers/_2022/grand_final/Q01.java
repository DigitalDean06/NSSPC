package past_year_papers._2022.grand_final;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, requiredA, requiredB, requiredC;
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            requiredA = scanner.nextInt();
            requiredB = scanner.nextInt();
            requiredC = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        if (a < 0 || b < 0 || c < 0 || requiredA < 0 || requiredB < 0 || requiredC < 0) {
            System.out.println("Invalid Input");
            return;
        }
        int productsCounter = 0;
        while (a >= requiredA && b >= requiredB && c >= requiredC) {
            a -= requiredA;
            b -= requiredB;
            c -= requiredC;
            productsCounter++;
        }
        System.out.println(productsCounter);
        System.out.printf("%d %d %d%n", a, b, c);
    }
}
