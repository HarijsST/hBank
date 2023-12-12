package exercise.task8.figures;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area(){
        return 3.14 * getRadius() * getRadius();
    }

    public double length(){
        return 2 * 3.14 * getRadius();
    }
}
