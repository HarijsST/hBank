package exercise.task2;

public class EquationApp {
    public static void main(String[] args) {
        EquationRepository equationRepository = new EquationRepository(4, 2, 6);
        System.out.println("Vienādouma X + Y * Z rezultāts ir " + equationRepository.EquationCalculation());
    }
}
