package exercise.task9.employeeTask;

public class Executive extends SalariedEmployee{
    public Executive(String name, String surname) {
        super(name, surname);
    }

    public Executive(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    private double bonus;
    public Executive(String name, String surname, double salary, double bonus) {
        super(name, surname, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public double pay(){
        return getSalary() + getBonus();
    }
}
