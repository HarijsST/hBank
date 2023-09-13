package salaryCalculator.model;

public class CalculatorResultModel {

    private double socialTax;
    private double dependents;
    private double taxableAmount;
    private double incomeTax;
    private double netSalary;

    public double getSocialTax() {
        return socialTax;
    }

    public void setSocialTax(double socialTax) {
        this.socialTax = socialTax;
    }

    public double getDependents() {
        return dependents;
    }

    public void setDependents(double dependents) {
        this.dependents = dependents;
    }

    public double getTaxableAmount() {
        return taxableAmount;
    }

    public void setTaxableAmount(double taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    public double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
}
