package exercise.task8.figures;

public class Cone extends Cylinder{
    public Cone(double radius) {
        super(radius);
    }

    public Cone(double radius, double height) {
        super(radius, height);
    }

    @Override
    public double volume(){
        return area() * getHeight() / 3;
    }
}
