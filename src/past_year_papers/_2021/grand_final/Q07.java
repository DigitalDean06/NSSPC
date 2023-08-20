package past_year_papers._2021.grand_final;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int bombs = scanner.nextInt();
        int[][] map = new int[rows][columns];
        boolean[][] mask = new boolean[rows][columns];
        for (int i = 0; i < bombs; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            mask[x][y] = true;
            for (int p = -1; p <= 1; p++) {
                for (int q = -1; q <= 1; q++) {
                    if (p == q && p == 0) continue;
                    if (x + p < 0 || y + q < 0 || x + p >= map.length || y + q >= map[0].length) continue;
                    map[x + p][y + q]++;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (mask[i][j]) System.out.print("*");
                else System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
