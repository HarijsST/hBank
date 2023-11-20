package exercise.task8.figures;

public class Cylinder extends Circle{
    public Cylinder(double radius) {
        super(radius);
    }

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double volume(){
        return area() * getHeight();
    }
}
