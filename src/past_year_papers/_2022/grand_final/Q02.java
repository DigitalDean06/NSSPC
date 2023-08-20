package past_year_papers._2022.grand_final;

import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int min = copy[0];
        int max = copy[copy.length - 1];
        int[] result = new int[arr.length];
        int resultIndex = 0;
        while (copy[resultIndex] == min) {
            result[resultIndex] = copy[resultIndex];
            resultIndex++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min || arr[i] == max) continue;
            result[resultIndex++] = arr[i];
        }
        while (resultIndex < result.length) result[resultIndex++] = max;
        System.out.println(String.join(" ", Arrays.stream(result).boxed().map(String::valueOf).toArray(String[]::new)));
    }
}
