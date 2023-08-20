package past_year_papers._2021.grand_final;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String crimeFragment = scanner.nextLine();
        String suspectFragment1 = scanner.nextLine();
        String suspectFragment2 = scanner.nextLine();
        String suspectFragment3 = scanner.nextLine();
        String suspectFragment4 = scanner.nextLine();
        int n = count(crimeFragment, str);
        int suspectCount1 = count(suspectFragment1, str);
        int suspectCount2 = count(suspectFragment2, str);
        int suspectCount3 = count(suspectFragment3, str);
        int suspectCount4 = count(suspectFragment4, str);
        if (suspectCount1 == n) {
            System.out.println(1);
            System.out.println(n);
        } else if (suspectCount2 == n) {
            System.out.println(2);
            System.out.println(n);
        } else if (suspectCount3 == n) {
            System.out.println(3);
            System.out.println(n);
        } else if (suspectCount4 == n) {
            System.out.println(4);
            System.out.println(n);
        } else {
            System.out.println(0);
            System.out.println(0);
        }
    }

    public static int count(String fragment, String str) {
        int n = 0;
        for (int i = 0; i < fragment.length() - 4; i++) {
            if (fragment.substring(i, i + 4).equals(str)) {
                i += str.length() - 1;
                n++;
            }
        }
        return n;
    }
}
