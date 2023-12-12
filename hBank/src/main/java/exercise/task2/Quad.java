package exercise.task2;

public class Quad {
    private int quadSideA;
    private int quadSideB;
    private int quadSideC;
    private int quadSideD;
    private int result;

    public Quad() {

    }

    public Quad(int quadSideA, int quadSideB, int quadSideC, int quadSideD) {
        this.quadSideA = quadSideA;
        this.quadSideB = quadSideB;
        this.quadSideC = quadSideC;
        this.quadSideD = quadSideD;
    }

    public int getQuadSideA() {
        return quadSideA;
    }

    public int getQuadSideB() {
        return quadSideB;
    }

    public int getQuadSideC() {
        return quadSideC;
    }

    public int getQuadSideD() {
        return quadSideD;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int quadCalculation(){
        setResult(getQuadSideA() + getQuadSideB() + getQuadSideC() + getQuadSideD());
        return getResult();
    }
}
