package hw_9;

import java.util.Comparator;

public class ComparatorByModel implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}
