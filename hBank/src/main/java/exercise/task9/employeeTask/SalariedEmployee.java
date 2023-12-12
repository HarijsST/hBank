package exercise.task9.employeeTask;

public class SalariedEmployee extends Employee{
    public SalariedEmployee(String name, String surname) {
        super(name, surname);
    }
    private double salary;

    public SalariedEmployee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double pay(){
        return getSalary();
    }
}
