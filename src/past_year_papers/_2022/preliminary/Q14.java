package past_year_papers._2022.preliminary;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        boolean[][] map = new boolean[rows][columns];
        for (int i = 0; i < rows; i++) for (int j = 0; j < columns; j++) map[i][j] = scanner.nextInt() == 1;
        int size = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) for (int j = 0; j < columns; j++) size = Math.max(size, findSize(map, i, j));
        System.out.println(size == 1 ? "No Square" : size);
    }

    public static int findSize(boolean[][] map, int i, int j) {
        int size = 1;
        while (true) {
            boolean b = true;
            for (int x = i; x < i + size; x++) {
                for (int y = j; y < j + size; y++) {
                    if (y >= map.length || x >= map[0].length || !map[y][x]) {
                        b = false;
                        break;
                    }
                }
                if (!b) break;
            }
            if (!b) break;
            size++;
        }
        return size - 1;
    }
}
