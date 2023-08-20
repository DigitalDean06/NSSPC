package past_year_papers._2021.grand_final;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "a"};
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int from = indexOf(arr, String.valueOf(input.charAt(0)));
            int to = indexOf(arr, String.valueOf(input.charAt(1)));
            if (from > to) {
                from ^= to;
                to ^= from;
                from ^= to;
            }
            while (from < to) {
                String temp = arr[from];
                arr[from] = arr[to];
                arr[to] = temp;
                from++;
                to--;
            }
        }
        System.out.println(String.join("", arr));
    }

    public static <T> int indexOf(T[] arr, T value) {
        for (int i = 0; i < arr.length; i++) if (arr[i].equals(value)) return i;
        return -1;
    }
}
