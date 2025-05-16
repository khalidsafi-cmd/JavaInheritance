public class FullTimeEmp extends Employee {
    private double salary;

    public FullTimeEmp(String name, String id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public String getStatus() {
        return "Full-Time";
    }

    @Override
    public double getMonthlyPay() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + getStatus() +  "\nMonthly Pay: $" + String.format("%,.2f", getMonthlyPay());
    }
}