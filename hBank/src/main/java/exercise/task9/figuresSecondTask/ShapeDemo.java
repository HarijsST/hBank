package exercise.task9.figuresSecondTask;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.7);
        System.out.println("Circle area is: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(5, 8);
        System.out.println("Rectangle area is: " + rectangle.calculateArea());

        Square square = new Square(2.5);
        System.out.println("Square area is: " + square.calculateArea());

        Triangle triangle = new Triangle(4, 13);
        System.out.println("Triangle area is: " + triangle.calculateArea());
    }
}
