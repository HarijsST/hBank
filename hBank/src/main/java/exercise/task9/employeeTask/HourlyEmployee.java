package exercise.task9.employeeTask;

public class HourlyEmployee extends Employee{

    public HourlyEmployee(String name, String surname) {
        super(name, surname);
    }
    private double hoursWorked;
    private double payRate;

    public HourlyEmployee(String name, String surname, double hoursWorked, double payRate) {
        super(name, surname);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double pay(){
        return getHoursWorked() * getPayRate();
    }
}
