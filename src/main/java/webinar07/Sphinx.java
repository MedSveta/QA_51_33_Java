package webinar07;

public class Sphinx extends Human implements Lion, Eagle {
    public static final String HABITAT_SPHINX = "desert";

    public Sphinx(boolean isMale, double weight, int age, String name) {
        super(isMale, weight, age, name);
    }

    @Override
    public String toString() {
        return super.toString() + "Sphinx";
    }

    @Override
    public void flyHigh() {
        System.out.println("I can fly High");
    }

    @Override
    public void killFast() {
        System.out.println("I kill very Fast");
    }

    @Override
    public String habitat() {
        return super.habitat()+ HABITAT_SPHINX;
    }
}
