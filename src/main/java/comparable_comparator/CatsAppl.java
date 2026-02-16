package comparable_comparator;

import java.util.Arrays;

public class CatsAppl {
    public static void main(String[] args) {
        int[] arr = {89, 5, 0, 45, 8, 10, 5, 9087, 34, 55};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Cat[] cats = {
                new Cat("Murzik", 10, 6.5),
                new Cat("Barsik", 1, 9.5),
                new Cat("Sima", 10, 3.5),
                new Cat("Tishka", 3, 7.8),
                new Cat("Mursik", 4, 4.2),
        };
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        System.out.println("============");
        Arrays.sort(cats, new ComparatorByName());
        System.out.println(Arrays.toString(cats));
        System.out.println("============");
        Arrays.sort(cats, new ComparatorByName().thenComparing(new ComparatorByWeight()));
        System.out.println(Arrays.toString(cats));
    }
}
