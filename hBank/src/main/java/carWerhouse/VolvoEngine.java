package carWerhouse;

public class VolvoEngine extends AbstractEngine{
    String avgVolvoEngine = "2.0l 250 Zs";

    public String getAvgVolvoEngine() {
        return avgVolvoEngine;
    }

    @Override
    public String toString() {
        return "VolvoEngine{" +
                "avgVolvoEngine='" + getAvgVolvoEngine() + '\'' +
                '}';
    }

    @Override
    public void start() {
        isStarted = true;
        System.out.println("Starting engine: " + getAvgVolvoEngine());
    }
}
