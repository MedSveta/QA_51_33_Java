package webinar05;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal("tiger",
                9, 129.0, true);
        System.out.println(animal1);
        printAnimal(animal1);
        System.out.println(animal1.getWeight());
        animal1.setAge(499);
        System.out.println(animal1);
        animal1.setAge(500);
        System.out.println(animal1);
        System.out.println("=============");
        Lion lion1 = new Lion("Pushok", 34, 309.,
                true, "savanna");
        lion1.makeVoice();
        Animal [] animals = {animal1, lion1};
        for (Animal a: animals){
            System.out.println(a);
        }
    }

    public static void printAnimal(Animal animal) {
        System.out.println("Name animal: " + animal.getName() +
                ", age animal: " + animal.getAge());
    }
}
