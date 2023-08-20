package past_year_papers._2021.grand_final;

import java.util.HashMap;
import java.util.Scanner;

public class Q02 {

    public static final double PI = 3.141592;

    public static final HashMap<String, Double> growthFactorMap = new HashMap<>() {{
        put("American Beech", 6.0);
        put("Basswood", 3.0);
        put("Common Horsechestnut", 8.0);
        put("Dogwood", 7.0);
        put("European White Birch", 5.0);
        put("White Fir", 7.5);
    }};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            double circumference = scanner.nextDouble();
            scanner.nextLine();
            String species = scanner.nextLine();
            if (circumference <= 0) {
                System.out.printf("The circumference for %s must be greater than 0!%n", species);
                continue;
            }
            double dbh = circumference / PI;
            double growthFactor = growthFactorMap.get(species);
            double age = dbh * growthFactor;
            System.out.printf("%s : %.1f : %.1f%n", species, circumference, age);
        }
    }
}
