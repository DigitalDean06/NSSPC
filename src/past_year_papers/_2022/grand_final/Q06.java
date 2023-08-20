package past_year_papers._2022.grand_final;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        City[] cities = new City[n];
        for (int i = 0; i < n; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            cities[i] = new City(x, y);
        }
        HashSet<City> visited = new HashSet<>();
        Comparator<City> xComparator = Comparator.comparingDouble(value -> value.x);
        Comparator<City> yComparator = Comparator.comparingDouble(value -> value.y);
        City startingCity = Arrays.stream(cities).sorted(xComparator.thenComparing(yComparator)).findFirst().orElseThrow();
        City endingCity = Arrays.stream(cities).sorted(xComparator.reversed().thenComparing(yComparator.reversed())).findFirst().orElseThrow();
        visited.add(startingCity);
        City currentCity = startingCity;
        double totalDistanceTravelled = 0;
        while (currentCity != endingCity) {
            double currentX = currentCity.x;
            double currentY = currentCity.y;
            City nearest = Arrays.stream(cities).filter(city -> !visited.contains(city)).sorted(Comparator.comparingDouble(o -> Math.pow(currentX - o.x, 2) + Math.pow(currentY - o.y, 2))).findFirst().orElseThrow();
            visited.add(nearest);
            totalDistanceTravelled += Math.sqrt(Math.pow(currentCity.x - nearest.x, 2) + Math.pow(currentCity.y - nearest.y, 2));
            currentCity = nearest;
        }
        System.out.printf("%.7f%n", totalDistanceTravelled);
    }

    public static class City {
        public final double x, y;

        public City(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
