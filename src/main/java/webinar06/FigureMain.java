package webinar06;

public class FigureMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle("blue", 7);
        Rectangle rectangle1 = new Rectangle("red",
                2, 6);
        Square square1 = new Square("yellow", 4);

        Figure[] figures = {circle1, rectangle1, square1};
        for (Figure f : figures) {
            System.out.println("This is the " + f.toString() +
                    ", his color is " + f.getColor() +
                    ", his square is " + f.getSquare() +
                    " and his perimeter is " + f.getPerimeter());
        }
    }
}
