package exercise.task9.figuresSecondTask;

public class Triangle implements Shape{
    private double triangleSide;
    private double triangleHeigth;
    private double area;

    public Triangle(double triangleSide, double triangleHeigth) {
        this.triangleSide = triangleSide;
        this.triangleHeigth = triangleHeigth;
    }

    public double getTriangleSide() {
        return triangleSide;
    }

    public double getTriangleHeigth() {
        return triangleHeigth;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
     public double calculateTriangleArea(){
        setArea((getTriangleHeigth() * triangleHeigth) / 2);
         return getArea();
     }

    @Override
    public double calculateArea() {
        return calculateTriangleArea();
    }
}
