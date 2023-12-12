package carWerhouse.models.engine;

public abstract class AbstractEngine implements Engine{

    protected boolean isStarted = false;

    public boolean isStarted() {
        return isStarted;
    }
}
