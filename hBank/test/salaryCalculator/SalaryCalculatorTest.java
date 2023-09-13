package salaryCalculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class SalaryCalculatorTest {

    // testa nosaukums =  testMetodesNosaukums_papildusNosacijumi

    @Test
    public void testCalculateIinPercentage_salary1000() {
        //preparation
        SalaryCalculator victim = new SalaryCalculator();

        //do
        victim.getCalculatorModel().setGrossSalary(1000);
        victim.calculateIinPercentage();

        //then
        double actualIin = victim.getCalculatorModel().getIin();
        double expectedIin = 20;
        assertThat(actualIin, is(expectedIin));
    }

    @Test
    public void testCalculateIinPercentage_salary2000() {
        //preparation
        SalaryCalculator victim = new SalaryCalculator();

        //do
        victim.getCalculatorModel().setGrossSalary(2000);
        victim.calculateIinPercentage();

        //then
        double actualIin = victim.getCalculatorModel().getIin();
        double expectedIin = 23;
        assertThat(actualIin, is(expectedIin));
    }

    @Test
    public void testCalculateIinPercentage_salary3000() {
        //preparation
        SalaryCalculator victim = new SalaryCalculator();

        //do
        victim.getCalculatorModel().setGrossSalary(2000);
        victim.calculateIinPercentage();

        //then
        double actualIin = victim.getCalculatorModel().getIin();
        double expectedIin = 23;
        assertThat(actualIin, is(expectedIin));
    }

    @Test
    public void testSalaryCalculation_Salary2000() {
        //preparation
        SalaryCalculator victim = new SalaryCalculator();

        //do
        victim.getCalculatorModel().setGrossSalary(2000);
        victim.salaryCalculation();

        //then
        double actualSocialTax = victim.getResultModel().getSocialTax();
        assertEquals(actualSocialTax, 210.0, 0.001); // Var arī rakstīt šādi
    }

    // Uzdevums:
    // Pabeigt CalculatorResultModel
    // Tad pielabot salaryCalculation metodi, tiek ņems vērā CalculatorResultModel
    // turpināt rakstīt testus, cik nu iespējams :)
}