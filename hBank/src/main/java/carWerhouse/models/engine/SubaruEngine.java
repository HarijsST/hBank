package carWerhouse.models.engine;

public class SubaruEngine extends AbstractEngine{
    String weakSubaruEngine = "1,6l 114 Zs";

    public String getWeakSubaruEngine() {
        return weakSubaruEngine;
    }

    @Override
    public String toString() {
        return getWeakSubaruEngine();
    }

    @Override
    public void start() {
        isStarted = true;
        System.out.println("Starting engine: " + getWeakSubaruEngine());
    }
}
