package webinar05;

import java.util.Objects;

public class WildAnimal extends Animal{
    private String habitat;

    public WildAnimal() {
    }

    public WildAnimal(String name, int age, double weight,
                      boolean isWild, String habitat) {
        super(name, age, weight, isWild);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WildAnimal that = (WildAnimal) o;
        return Objects.equals(habitat, that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return "WildAnimal {" +
                "habitat = '" + habitat + '\'' +
                "} " + super.toString();
    }

}
