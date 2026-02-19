package hw_9;

import java.util.Arrays;
import java.util.Comparator;

public class CarAppl {
    public static void main(String[] args) {
        Car car1 = new Car(2024, "Volvo", "Blue", 1.5, 24000.);
        Car car2 = new Car(1923, "Mercedes", "Black", 3.5, 1240000.);
        Car car3 = new Car(2022, "Tesla", "Gold", 0, 240000.);
        Car car4 = new Car(2026, "Mazda", "Red", 1.2, 140000.);
        Car car5 = new Car(2024, "Toyota", "Grey", 2.0, 150000.);

        Car[] cars = {car1, car2, car3, car4, car5};

        System.out.println("=============");
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
        System.out.println("=============");
        printCar(cars);
        System.out.println("=============");
        Arrays.sort(cars, new ComparatorByColor());
        printCar(cars);
        System.out.println("=============");
        Arrays.sort(cars, new ComparatorByColor().reversed());
        printCar(cars);
        System.out.println("=============");
        Arrays.sort(cars, new ComparatorByYearReverse()
                .thenComparing(new ComparatorByColor())
                .thenComparing(new ComparatorByPrice()));
        printCar(cars);
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getYear(), o2.getYear());
            }
        });
    }

    private static void printCar(Car[] cars) {
        if (cars != null && cars.length != 0) {
            for (Car c: cars)
                System.out.println(c);
        }
        else System.out.println("Cars is Null or Empty");
    }
}
