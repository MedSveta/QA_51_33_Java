package webinar07;

public class Mermaid extends Human implements Fish {
    public static final String HABITAT_MERMAID = "ocean and sea and lake";

    public Mermaid(boolean isMale, double weight, int age, String name) {
        super(isMale, weight, age, name);
    }

    @Override
    public void breathUnderWater() {
        System.out.println("I can breath under water");
    }

    @Override
    public String toString() {
        return super.toString() + "Mermaid";
    }

    @Override
    public String habitat() {
        return super.habitat() + HABITAT_MERMAID;
    }
}
