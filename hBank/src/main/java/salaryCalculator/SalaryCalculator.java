package salaryCalculator;

import salaryCalculator.model.CalculatorModel;
import salaryCalculator.model.CalculatorResultModel;
import salaryCalculator.utils.UserInputHelper;

import java.text.DecimalFormat;

public class SalaryCalculator {
    private final DecimalFormat decimalFormat = new DecimalFormat("0.00");
    private final CalculatorModel calculatorModel = new CalculatorModel();
    private final CalculatorResultModel resultModel = new CalculatorResultModel();

    public void infoInput() {
        System.out.println("Ievadīt Bruto algu");
        double grossSalary = UserInputHelper.getInputTillIsANumber();
        calculatorModel.setGrossSalary(grossSalary);

        System.out.println("Ievadīt apgādājamo skaitu");
        int dependents = UserInputHelper.getInputTillIsANumber();
        calculatorModel.setNumberOfDependents(dependents);

        System.out.println("Ievadīt papildus nodokļa atvieglojumus");
        double benefits = UserInputHelper.getInputTillIsANumber();
        calculatorModel.setBenefits(benefits);

        System.out.println("Norādīt precīzu neapliekamo minimumu");
        double taxMinimum = UserInputHelper.getInputTillIsANumber();
        calculatorModel.setTaxMinimum(taxMinimum);
    }

    public void calculateIinPercentage() {
        double iin;
        double yearSalary = calculatorModel.getGrossSalary() * 12;
        if (yearSalary <= 20004) {
            iin = 20;
        } else if (yearSalary >= 20004 && yearSalary <= 78100) {
            iin = 23;
        } else {
            iin = 31;
        }
        calculatorModel.setIin(iin);
    }

    public void salaryCalculation() {
        printInfoInput();
        double socNodoklis = calculatorModel.getGrossSalary() * calculatorModel.getVsaWorker() / 100;
        resultModel.setSocialTax(socNodoklis);
        System.out.println("Valsts sociālās apdrošināšanas obligātās iemaksas - " + decimalFormat.format(resultModel.getSocialTax()));

        double apgadajamie = calculatorModel.getReliefForDependents() * calculatorModel.getNumberOfDependents();
        resultModel.setDependents(apgadajamie);
        System.out.println("Atvieglojums par apgādībā esošām personām - " + decimalFormat.format(resultModel.getDependents()));

        double apliekamaSumma = calculatorModel.getGrossSalary() - socNodoklis - apgadajamie - 82.14; // Bruto alga ir starp 500 un 1200 eiro, piemēro VID prognozēto diferencēto neapliekamo minimumu 82,14 (eiro)
        resultModel.setTaxableAmount(apliekamaSumma);
        System.out.println("Piemērojamais neapliekamais minimums - " + decimalFormat.format(resultModel.getTaxableAmount()));

        calculateIinPercentage();
        double iinSumma = apliekamaSumma * calculatorModel.getIin() / 100;
        resultModel.setIncomeTax(iinSumma);
        System.out.println("Iedzīvotāju ienākumu nodoklis - " + decimalFormat.format(resultModel.getIncomeTax()));

        double netoAlga = calculatorModel.getGrossSalary() - socNodoklis - iinSumma;
        resultModel.setNetSalary(netoAlga);
        System.out.println("Ikmēneša neto alga (\"uz rokas\") - " + decimalFormat.format(resultModel.getNetSalary()));
    }

    public CalculatorModel getCalculatorModel() {
        return calculatorModel;
    }

    public CalculatorResultModel getResultModel() {
        return resultModel;
    }

    public void printInfoInput() {
        System.out.println("Bruto alga - " + calculatorModel.getGrossSalary() +
                " Apgādājamo skaits - " + calculatorModel.getNumberOfDependents() +
                " Nodokļu atvieglojumi - " + calculatorModel.getBenefits() +
                " Precīzs neapliekamais minimums - " + calculatorModel.getTaxMinimum());
    }
}