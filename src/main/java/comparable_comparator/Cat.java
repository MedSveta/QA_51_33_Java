package comparable_comparator;

import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;
    private double weight;

    public Cat() {
    }

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(weight, cat.weight) == 0 && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

//    @Override
//    public int compareTo(Cat anotherCat) {
//        String nameCat = this.getName();
//        String nameAnotherCat = anotherCat.getName();
//        //return nameCat.compareTo(nameAnotherCat); //Ascending
//        return nameAnotherCat.compareTo(nameCat); //Descending
//    }

    @Override
    public int compareTo(Cat anotherCat) {
        int ageCat = this.getAge();
        int ageAnotherCat = anotherCat.getAge();
        int res = ageCat - ageAnotherCat;
        if (res != 0)
            return res;
        else {
            res = Double.compare(this.getWeight(),
                    anotherCat.getWeight());
            return res;
        }

        // 3 - 5 = -2 cat<anotherCat
        // 5 - 3 = 2 cat>anotherCat
        // 3 - 3 = 0 cat=anotherCat
    }
}
