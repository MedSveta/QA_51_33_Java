package webinar07;

public class Centaur extends Human implements Horse, Comparable<Centaur>{
    public static final String HABITAT_CENTAUR =
            "mountains and forests";

    public Centaur(boolean isMale, double weight, int age, String name) {
        super(isMale, weight, age, name);
    }

    @Override
    public String toString() {
        return "Centaur{} " + super.toString();
    }

    @Override
    public String habitat() {
        return super.habitat() + HABITAT_CENTAUR;
    }

    @Override
    public void ride() {
        System.out.println("I can ride with speed 100 km per hour");
    }

    @Override
    public void fendingOffFliesWithMyTail() {
        Horse.super.fendingOffFliesWithMyTail();
    }

    @Override
    public int compareTo(Centaur anotherCentaur) {
        int res = this.getAge() - anotherCentaur.getAge();
        return res == 0?Double.compare(this.getWeight(), anotherCentaur.getWeight()): res;
    }
}
