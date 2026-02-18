package webinar08;

import webinar07.Centaur;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Centaur> {
    @Override
    public int compare(Centaur o1, Centaur o2) {
        return o1.getAge()- o2.getAge();
    }
}
