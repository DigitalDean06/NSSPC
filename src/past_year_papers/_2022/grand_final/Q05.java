package past_year_papers._2022.grand_final;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        f(arr, new int[]{}, 0);
    }

    public static void f(int[] arr, int[] current, int i) {
        for (int j = i; j < arr.length; j++) {
            int[] newArr = Arrays.copyOf(current, current.length + 1);
            newArr[newArr.length - 1] = arr[j];
            if (calcSum(newArr) > 24) continue;
            if (calcSum(newArr) == 24) {
                Arrays.sort(newArr);
                System.out.println(String.join("\n", Arrays.stream(newArr).boxed().map(String::valueOf).toArray(String[]::new)));
            } else f(arr, newArr, j + 1);
        }
    }

    public static int calcSum(int[] arr) {
        return Arrays.stream(arr).boxed().reduce(0, Integer::sum);
    }
}
