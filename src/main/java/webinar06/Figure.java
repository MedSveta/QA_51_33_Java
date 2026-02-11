package webinar06;

import java.util.Objects;

public abstract class Figure {
    private String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Objects.equals(color, figure.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }

    @Override
    public String toString() {
        return "Figure {" +
                "color = '" + color + '\'' +
                '}';
    }

    abstract double getSquare();
    abstract double getPerimeter();
}
