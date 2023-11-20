package exercise.task4;

public class LightColorDetectorApp {
    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();

        lightColorDetector.printColor(-1);
        lightColorDetector.printColor(100);
        lightColorDetector.printColor(380);
        lightColorDetector.printColor(460);
        lightColorDetector.printColor(569);
        lightColorDetector.printColor(600);
        lightColorDetector.printColor(750);
        lightColorDetector.printColor(1200);
    }
}
