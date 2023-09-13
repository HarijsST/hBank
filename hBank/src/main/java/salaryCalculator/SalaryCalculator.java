package salaryCalculator;

import java.text.DecimalFormat;

public class SalaryCalculator {
    private final DecimalFormat decimalFormat = new DecimalFormat("0.00");
    CalculatorModel cm = new CalculatorModel();
    public void infoInput(){
        System.out.println("Ievadīt Bruto algu");
        double grossSalary = TestNumbers.getInputTillIsANumber();
        cm.setGrossSalary(grossSalary);
        
        System.out.println("Ievadīt apgādājamo skaitu");
        int dependents = TestNumbers.getInputTillIsANumber();
        cm.setNumberOfDependents(dependents);
        
        System.out.println("Ievadīt papildus nodokļa atvieglojumus");
        double benefits = TestNumbers.getInputTillIsANumber();
        cm.setBenefits(benefits);
        
        System.out.println("Norādīt precīzu neapliekamo minimumu");
        double taxMinimum = TestNumbers.getInputTillIsANumber();
        cm.setTaxMinimum(taxMinimum);
    }

    public void calculateIinPercentage(){
        double iin;
        double yearSalary = cm.getGrossSalary() * 12;
        if(yearSalary <= 20004){
            iin = 20;
        }else if(yearSalary >= 20004 && yearSalary <= 78100){
            iin = 23;
        }else {
            iin = 31;
        }
        cm.setIin(iin);
    }

    public void salaryCalculation(){
        printInfoInput();
        double socNodoklis = cm.getGrossSalary() * cm.getVsaWorker() / 100;
        System.out.println("Valsts sociālās apdrošināšanas obligātās iemaksas - " + decimalFormat.format(socNodoklis));
        
        double apgadajamie = cm.getReliefForDependents() * cm.getNumberOfDependents();
        System.out.println("Atvieglojums par apgādībā esošām personām - " + decimalFormat.format(apgadajamie));
       
        double apliekamaSumma = cm.getGrossSalary() - socNodoklis - apgadajamie - 82.14; // Bruto alga ir starp 500 un 1200 eiro, piemēro VID prognozēto diferencēto neapliekamo minimumu 82,14 (eiro)
        System.out.println("Piemērojamais neapliekamais minimums - " + decimalFormat.format(apliekamaSumma));
        
        calculateIinPercentage();
        double iinSumma = apliekamaSumma * cm.getIin() / 100;
        System.out.println("Iedzīvotāju ienākumu nodoklis - " + decimalFormat.format(iinSumma));
        
        double netoAlga = cm.getGrossSalary() - socNodoklis - iinSumma;
        System.out.println("Ikmēneša neto alga (\"uz rokas\") - " + decimalFormat.format(netoAlga));
    }

    public void printInfoInput(){
        System.out.println("Bruto alga - " + cm.getGrossSalary() +
                " Apgādājamo skaits - " + cm.getReliefForDependents() +
                " Nodokļu atvieglojumi - " + cm.getBenefits() +
                " Precīzs neapliekamais minimums - " + cm.getTaxMinimum());
    }
}