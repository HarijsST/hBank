package carWerhouse.models.engine;

public class BmwEngine extends AbstractEngine{
    private String powerFullBmwEngine = "4.4l V8 333 Zs";

    public String getPowerFullBmwEngine() {
        return powerFullBmwEngine;
    }

    @Override
    public String toString() {
        return getPowerFullBmwEngine();
    }

    @Override
    public void start() {
        isStarted = true;
        System.out.println("Starting engine: " + getPowerFullBmwEngine());
    }
}