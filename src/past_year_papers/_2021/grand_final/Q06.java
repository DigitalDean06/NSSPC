package past_year_papers._2021.grand_final;

import java.util.*;

public class Q06 {

    public static final Comparator<MalaysianID> birthYearComparator = Comparator.comparingInt(a -> a.birthYear);
    public static final Comparator<MalaysianID> birthMonthComparator = Comparator.comparingInt(a -> a.birthMonth);
    public static final Comparator<MalaysianID> birthDayComparator = Comparator.comparingInt(a -> a.birthDay);
    public static final Comparator<MalaysianID> birthdateComparator = birthYearComparator.thenComparing(birthMonthComparator).thenComparing(birthDayComparator);
    public static final Comparator<MalaysianID> maleFirstComparator = (a, b) -> {
        if (a.isMale == b.isMale) return 0;
        return a.isMale ? -1 : 1;
    };
    public static final Comparator<MalaysianID> femaleFirstComparator = (a, b) -> -maleFirstComparator.compare(a, b);
    public static final Map<String, Comparator<MalaysianID>> map = new HashMap<>() {{
        put("Birthdate", birthdateComparator);
        put("Birth Year", birthdateComparator);
        put("Birth Month", birthMonthComparator);
        put("Birth Day", birthDayComparator);
        put("Gender with Male first", maleFirstComparator);
        put("Gender with Female first", femaleFirstComparator);
    }};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MalaysianID[] arr = Arrays.stream(scanner.nextLine().split(";")).map(MalaysianID::new).toArray(MalaysianID[]::new);
        String sorter1 = scanner.nextLine();
        String sorter2 = scanner.nextLine();
        String sorter3 = scanner.nextLine();
        Comparator<MalaysianID> comparator1 = map.get(sorter1);
        Comparator<MalaysianID> comparator2 = map.get(sorter2);
        Comparator<MalaysianID> comparator3 = map.get(sorter3);
        Arrays.sort(arr, comparator1.thenComparing(comparator2).thenComparing(comparator3));
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static class MalaysianID {

        public static final HashMap<Integer, String> monthNames = new HashMap<>() {{
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
        public final String id;
        public final int birthYear, birthMonth, birthDay;
        public final boolean isMale;

        public MalaysianID(String id) {
            this.id = id;
            String[] parts = id.split("-");
            int year = Integer.parseInt(parts[0].substring(0, 2));
            year += year > 21 ? 1900 : 2000;
            int month = Integer.parseInt(parts[0].substring(2, 4));
            int day = Integer.parseInt(parts[0].substring(4));
            birthYear = year;
            birthMonth = month;
            birthDay = day;
            isMale = Integer.parseInt(String.valueOf(id.charAt(id.length() - 1))) % 2 == 1;
        }

        @Override
        public String toString() {
            return String.format("%s %d %s %s %s", id, birthDay, monthNames.get(birthMonth), birthYear, isMale ? "Male" : "Female");
        }
    }
}
