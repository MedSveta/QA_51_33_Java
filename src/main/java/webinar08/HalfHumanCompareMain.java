package webinar08;

import webinar07.Centaur;

import java.util.Arrays;

public class HalfHumanCompareMain {
    public static void main(String[] args) {
        Centaur centaur1 = new Centaur(true, 137.,
                237, "Hiron");
        Centaur centaur2 = new Centaur(false, 127.,
                223, "Hirona");
        Centaur centaur3 = new Centaur(false, 101.,
                77, "Ariana");
        Centaur centaur4 = new Centaur(true, 437.,
                299, "Miron");
        Centaur centaur5 = new Centaur(true, 137.,
                237, "Aaron");
        Centaur centaur6 = new Centaur(true, 117.,
                237, "Hiron");

        Centaur[] centaurs = {centaur1, centaur2,
                centaur6, centaur3, centaur4, centaur5};

        System.out.println(centaur1.equals(centaur2));
        System.out.println(centaur1.equals(centaur5));
        System.out.println("====================");
        System.out.println(centaur1.compareTo(centaur2));
        System.out.println(centaur1.compareTo(centaur5));
        System.out.println("====================");
        Arrays.sort(centaurs);
        System.out.println(Arrays.toString(centaurs));
        System.out.println("====================");
        Arrays.sort(centaurs, new ComparatorByNameReverse().reversed());
        System.out.println(Arrays.toString(centaurs));
        Arrays.sort(centaurs, new ComparatorByNameReverse());
        System.out.println(Arrays.toString(centaurs));
        System.out.println("====================");
        Arrays.sort(centaurs, new ComparatorByAge().reversed()
                .thenComparing(new ComparatorByName()));
        System.out.println(Arrays.toString(centaurs));
    }
}
