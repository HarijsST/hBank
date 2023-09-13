package salaryCalculator;

import java.text.DecimalFormat;

import static salaryCalculator.TestNumbers.getInputTillIsANumber;

public class SalaryCalculator extends CalculatorModel {
    private final DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public void infoInput(){
        System.out.println("Ievadīt Bruto algu");
        double grossSalary = getInputTillIsANumber();
        setGrossSalary(grossSalary);
        //=====================================================
        System.out.println("Ievadīt apgādājamo skaitu");
        int dependents = getInputTillIsANumber();
        setNumberOfDependents(dependents);
        //=====================================================
        System.out.println("Ievadīt papildus nodokļa atvieglojumus");
        double benefits = getInputTillIsANumber();
        setBenefits(benefits);
        //=====================================================
        System.out.println("Norādīt precīzu neapliekamo minimumu");
        double taxMinimum = getInputTillIsANumber();
        setTaxMinimum(taxMinimum);
    }

    public double iin(){
        double iin;
        double yearSalary = getGrossSalary() * 12;
        if(yearSalary <= 20004){
            iin = 20;
            setIin(iin);
        }else if(yearSalary >= 20004 && yearSalary <= 78100){
            iin = 23;
            setIin(iin);
        }else {
            iin = 31;
            setIin(iin);
        }
        return iin;
    }

    public void salaryCalculation(){
        printInfoInput();
        double socNodoklis = getGrossSalary() * getVsaWorker() / 100;
        System.out.println("Valsts sociālās apdrošināšanas obligātās iemaksas - " + decimalFormat.format(socNodoklis));
        // ===========================================================
        double apgadajamie = getNumberOfDependents() * getReliefForDependents();
        System.out.println("Atvieglojums par apgādībā esošām personām - " + decimalFormat.format(apgadajamie));
        // ===========================================================
        double apliekamaSumma = getGrossSalary() - socNodoklis - apgadajamie - 82.14; // Bruto alga ir starp 500 un 1200 eiro, piemēro VID prognozēto diferencēto neapliekamo minimumu 82,14 (eiro)
        System.out.println("Piemērojamais neapliekamais minimums - " + decimalFormat.format(apliekamaSumma));
        // ===========================================================
        double iinSumma = apliekamaSumma * iin() / 100;
        System.out.println("Iedzīvotāju ienākumu nodoklis - " + decimalFormat.format(iinSumma));
        // ===========================================================
        double netoAlga = getGrossSalary() - socNodoklis - iinSumma;
        System.out.println("Ikmēneša neto alga (\"uz rokas\") - " + decimalFormat.format(netoAlga));
    }

    public void printInfoInput(){
        System.out.println("Bruto alga - " + getGrossSalary() +
                " Apgādājamo skaits - " + getNumberOfDependents() +
                " Nodokļu atvieglojumi - " + getBenefits() +
                " Precīzs neapliekamais minimums - " + getTaxMinimum());
    }
}