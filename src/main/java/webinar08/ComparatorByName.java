package webinar08;

import webinar07.Centaur;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Centaur> {

    @Override
    public int compare(Centaur o1, Centaur o2) {
        return o1.getName()
                .compareToIgnoreCase(o2.getName());
    }
}
