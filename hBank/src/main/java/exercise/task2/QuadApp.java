package exercise.task2;

public class QuadApp {
    public static void main(String[] args) {
        Quad quadRepository = new Quad(2, 4, 6, 8);
        System.out.println("Četrstūra perimetrs ir " + quadRepository.quadCalculation() + " metri");
    }
}
