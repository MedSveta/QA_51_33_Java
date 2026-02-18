package webinar07;

import java.util.Objects;

public class Human {
    private String name;
    private int age;
    private double weight;
    private boolean isMale;

    public Human() {
    }

    public Human(boolean isMale, double weight,
                 int age, String name) {
        this.isMale = isMale;
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank())
            this.name = name;
        else System.out.println("Wrong name!!!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 300)
            this.age = age;
        else System.out.println("Wrong age!!");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0. && weight < 1000.)
            this.weight = weight;
        else System.out.println("Wrong weight!!!");
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

//    @Override
//    public String toString() {
//        return "Human - ";
//    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isMale=" + isMale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Double.compare(weight, human.weight) == 0 && isMale == human.isMale && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, isMale);
    }

    public String habitat(){
        return "I live in the - ";
    }
}
