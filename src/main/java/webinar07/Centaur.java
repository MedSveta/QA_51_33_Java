package webinar07;

public class Centaur extends Human implements Horse{
    public static final String HABITAT_CENTAUR =
            "mountains and forests";

    public Centaur(boolean isMale, double weight, int age, String name) {
        super(isMale, weight, age, name);
    }

    @Override
    public String toString() {
        return super.toString() + "Centaur";
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
}
