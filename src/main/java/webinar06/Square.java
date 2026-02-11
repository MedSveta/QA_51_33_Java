package webinar06;

import java.util.Objects;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return side == square.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }

    @Override
    double getSquare() {
        return Math.pow(side, 2);
    }

    @Override
    double getPerimeter() {
        return side * 4;
    }
}
