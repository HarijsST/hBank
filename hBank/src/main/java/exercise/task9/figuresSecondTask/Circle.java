package exercise.task9.figuresSecondTask;

public class Circle implements Shape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * getRadius() * getRadius();
    }
}
