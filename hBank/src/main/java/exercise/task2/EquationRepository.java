package exercise.task2;

public class EquationRepository extends Equation{
    public EquationRepository(int x, int y, int z) {
        super(x, y, z);
    }

    public int EquationCalculation(){
        setResult(getX() + (getY() * getZ()));
        return getResult();
    }
}
