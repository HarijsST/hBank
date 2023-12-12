package exercise.task9.figuresSecondTask;

public class Square implements Shape{
    private double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    public double getSquareSide() {
        return squareSide;
    }

    @Override
    public double calculateArea() {
        return getSquareSide() * getSquareSide();
    }
}
