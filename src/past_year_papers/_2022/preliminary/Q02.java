package past_year_papers._2022.preliminary;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();
        double bmi = weight / height / height;
        System.out.printf("%.2f%n", bmi);
        if (bmi < 20) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Healthy Weight");
        else if (bmi < 30) System.out.println("Overweight");
        else System.out.println("Obesity");
    }
}
