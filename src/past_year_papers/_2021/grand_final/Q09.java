package past_year_papers._2021.grand_final;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] customerStrings = input.split(";");
        Customer[] customers = new Customer[customerStrings.length];
        for (int i = 0; i < customerStrings.length; i++) {
            String[] customerParts = customerStrings[i].split("#");
            customers[i] = new Customer(customerParts[0]);
            String[] foodStrings = customerParts[1].split("%");
            for (String foodString : foodStrings) {
                String[] foodParts = foodString.split(":");
                customers[i].addFood(foodParts[0], Integer.parseInt(foodParts[1]));
            }
        }
        Food[] processing = new Food[3];
        int time = 0;
        while (!Arrays.stream(customers).allMatch(a -> a.pickUpTime != -1)) {
            if (Arrays.stream(processing).anyMatch(Objects::isNull)) {
                for (int i = 0; i < processing.length; i++) {
                    if (processing[i] != null) continue;
                    for (Customer customer : customers) {
                        if (customer.pickUpTime != -1) continue;
                        Food foundFood = Arrays.stream(customer.foods).filter(food -> food != null && !food.preparing && food.amount > 0).max(Comparator.comparingInt(a -> a.amount)).orElse(null);
                        if (foundFood == null) continue;
                        processing[i] = foundFood;
                        foundFood.preparing = true;
                        break;
                    }
                }
            }
            time += 5;
            for (int i = 0; i < processing.length; i++) {
                Food food = processing[i];
                if (food == null) continue;
                if (food.amount > 0) food.amount--;
                if (food.amount <= 0) {
                    processing[i] = null;
                    food.preparing = false;
                }
            }
            for (Customer customer : customers) if (customer.isReadyToPickUp() && customer.pickUpTime == -1) customer.pickUpTime = time;
        }
        Arrays.stream(customers).forEach(customer -> System.out.printf("%s can collect food at %s%n", customer.name, getTimeFormatting(customer.pickUpTime)));
    }

    public static String getTimeFormatting(int time) {
        int hour = 10;
        int minute = time;
        hour += minute / 60;
        minute %= 60;
        return String.format("%s:%s", String.format("%2d", hour).replace(" ", "0"), String.format("%2d", minute).replace(" ", "0"));
    }

    public static class Customer {
        public final String name;
        public final Food[] foods = new Food[3];
        public int pickUpTime = -1;

        public Customer(String name) {
            this.name = name;
        }

        public void addFood(String type, int amount) {
            for (Food food : foods) {
                if (food != null && food.type.equals(type)) {
                    food.amount += amount;
                    return;
                }
            }
            for (int i = 0; i < 3; i++) {
                if (foods[i] == null) {
                    foods[i] = new Food(type, amount);
                    return;
                }
            }
        }

        public boolean isReadyToPickUp() {
            return Arrays.stream(foods).noneMatch(a -> a != null && a.amount > 0);
        }
    }

    public static class Food {
        public final String type;
        public int amount;
        public boolean preparing = false;

        public Food(String type, int amount) {
            this.type = type;
            this.amount = amount;
        }
    }
}
