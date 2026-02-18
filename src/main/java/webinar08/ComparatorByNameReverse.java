package webinar08;

import webinar07.Centaur;

import java.util.Comparator;

public class ComparatorByNameReverse implements Comparator<Centaur> {
    @Override
    public int compare(Centaur o1, Centaur o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
