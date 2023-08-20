package past_year_papers._2023.preliminary;

import java.util.HashMap;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int manufactureWeek = scanner.nextInt();
        int manufactureYear = scanner.nextInt();
        int purchaseMonth = scanner.nextInt();
        int purchaseYear = scanner.nextInt();
        scanner.close();
        int manufactureMonth = 1;
        int manufactureDays = (manufactureWeek - 1) * 7;
        int days;
        while (manufactureDays > (days = getDays(manufactureMonth, manufactureYear % 4 == 0))) {
            manufactureMonth++;
            manufactureDays -= days;
        }
        HashMap<Integer, String> monthNames = new HashMap<>() {{
            put(1, "January");
            put(2, "February");
            put(3, "March");
            put(4, "April");
            put(5, "May");
            put(6, "June");
            put(7, "July");
            put(8, "August");
            put(9, "September");
            put(10, "October");
            put(11, "November");
            put(12, "December");
        }};
        System.out.printf("%s %d%n", monthNames.get(manufactureMonth), manufactureYear);
        System.out.println(purchaseMonth - manufactureMonth + (purchaseYear - manufactureYear) * 12);
    }

    public static int getDays(int month, boolean leap) {
        if (month <= 7) {
            if (month == 2) return leap ? 29 : 28;
            else return month % 2 == 0 ? 30 : 31;
        }
        return month % 2 == 0 ? 31 : 30;
    }
}
