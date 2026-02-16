package comparable_comparator;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
