package past_year_papers._2022.preliminary;

import java.util.Arrays;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int p = scanner.nextInt();
        Node[] nodes = new Node[(int) Math.pow(2, x) - 1];
        for (int i = 0; i < Math.pow(2, x) - 1; i++) nodes[i] = new Node(scanner.nextInt());
        for (int i = 0; i < Math.pow(2, x) - 1 - Math.pow(2, x - 1); i++) {
            nodes[i].left = nodes[2 * i + 1];
            nodes[i].right = nodes[2 * (i + 1)];
        }
        Node found = Arrays.stream(nodes).filter(node -> node.value == p).findFirst().orElseThrow();
        System.out.printf("%s %s%n", found.left.value == -1 ? "NULL" : found.left.value, found.right.value == -1 ? "NULL" : found.right.value);
    }

    public static class Node {
        public final int value;
        public Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }
}
