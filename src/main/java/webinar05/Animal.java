package webinar05;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private double weight;
    private boolean isWild;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name, int age, double weight, boolean isWild) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isWild = isWild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank())
            this.name = name;
        else System.out.println("Wrong name!!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 500)
            this.age = age;
        else System.out.println("Wrong age!!!");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0. && weight < 300000.F)
            this.weight = weight;
        else System.out.println("Wrong weight!!!");
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", weight = " + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Double.compare(weight, animal.weight) == 0 && isWild == animal.isWild && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, isWild);
    }

    public void makeVoice(){
        System.out.println("Animal make voice --> RRRRR");
    }
}
