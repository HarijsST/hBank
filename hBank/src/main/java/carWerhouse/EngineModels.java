package carWerhouse;

public class EngineModels {
    private String bmwEngine = "4,4l V8 333 Zs";
    private String subaruEngine = "1,6l 114 Zs";
    private String volvoEngine = "2.0 250 Zs";

    public String getBmwEngine() {
        return bmwEngine;
    }

    public String getSubaruEngine() {
        return subaruEngine;
    }

    public String getVolvoEngine() {
        return volvoEngine;
    }

    @Override
    public String toString() {
        return "EngineModels{" +
                "bmwEngine='" + getBmwEngine() + '\'' +
                ", subaruEngine='" + getSubaruEngine() + '\'' +
                ", volvoEngine='" + getVolvoEngine() + '\'' +
                '}';
    }
}
