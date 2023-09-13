package salaryCalculator;

public class CalculatorModel {
    private double grossSalary; // bruto alga
    private int numberOfDependents; // apgādājamo skaits
    private  static final double reliefForDependents = 250; // Atvieglojums par apgādībā esošām personām
    private double benefits; // papildus nodokļa atvieglojumus
    private double taxMinimum; // precīzs neapliekamais minimums
    private double iin; // Iedzīvotāju ienākuma nodoklis
    private static final double vsaWorker = 10.5; // Valsts sociālās apdrošināšanas obligātās iemaksas likme DARBINIEKAM
    private static final double vsaEmployer = 23.59; // Valsts sociālās apdrošināšanas obligātās iemaksas likme DARBA DEVĒJAM

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public int getNumberOfDependents() {
        return numberOfDependents;
    }

    public void setNumberOfDependents(int numberOfDependents) {
        this.numberOfDependents = numberOfDependents;
    }

    public double getReliefForDependents() {
        return reliefForDependents;
    }

    public double getBenefits() {
        return benefits;
    }

    public void setBenefits(double benefits) {
        this.benefits = benefits;
    }

    public double getTaxMinimum() {
        return taxMinimum;
    }

    public void setTaxMinimum(double taxMinimum) {
        this.taxMinimum = taxMinimum;
    }

    public double getIin() {
        return iin;
    }

    public void setIin(double iin) {
        this.iin = iin;
    }

    public double getVsaWorker() {
        return vsaWorker;
    }

    public double getVsaEmployer() {
        return vsaEmployer;
    }

    @Override
    public String toString() {
        return "CalculatorModel{" +
                "grossSalary=" + grossSalary +
                ", numberOfDependents=" + numberOfDependents +
                ", reliefForDependents=" + reliefForDependents +
                ", benefits=" + benefits +
                ", taxMinimum=" + taxMinimum +
                ", iin=" + iin +
                ", vsaWorker=" + vsaWorker +
                ", vsaEmployer=" + vsaEmployer +
                '}';
    }
}
