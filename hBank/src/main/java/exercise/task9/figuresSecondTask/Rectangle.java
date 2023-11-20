package exercise.task9.figuresSecondTask;

public class Rectangle implements Shape{
    private double rectangleSideX;
    private double rectangleSideY;

    public Rectangle(double rectangleSideX, double rectangleSideY) {
        this.rectangleSideX = rectangleSideX;
        this.rectangleSideY = rectangleSideY;
    }

    public double getRectangleSideX() {
        return rectangleSideX;
    }

    public double getRectangleSideY() {
        return rectangleSideY;
    }

    @Override
    public double calculateArea() {
        return getRectangleSideX() * getRectangleSideY();
    }
}
