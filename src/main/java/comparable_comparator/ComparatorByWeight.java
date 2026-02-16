package comparable_comparator;

import java.util.Comparator;

public class ComparatorByWeight implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}
