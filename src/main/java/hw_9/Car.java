package hw_9;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private int year;
    private String model;
    private String color;
    private double engine;
    private double price;

    public Car() {
    }

    public Car(int year, String model, String color,
               double engine, double price) {
        this.year = year;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1886 && year <= 2026)
            this.year = year;
        else System.out.println("Wrong year");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank())
            this.model = model;
        else System.out.println("Wrong model");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank())
            this.color = color;
        else System.out.println("Wrong color");
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        if (engine >= 0. && engine < 8.)
            this.engine = engine;
        System.out.println("Wrong engine");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0 && price < 2_000_000_000.)
            this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Double.compare(engine, car.engine) == 0 && Double.compare(price, car.price) == 0 && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, model, color, engine, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car anotherCar) {
        return this.getYear() - anotherCar.getYear();
    }
}
