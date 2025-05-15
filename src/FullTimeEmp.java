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
    public double calculateMonthlyPay() {
        return salary / 12; // Monthly salary (annual divided by 12)
    }

    @Override
    public double getMonthlyPay() {
        return calculateMonthlyPay();
    }

    @Override
    public String toString() {
        return super.toString() + " - " + getStatus() + 
               "\nAnnual Salary: $" + String.format("%,.2f", salary) +
               "\nMonthly Pay: $" + String.format("%,.2f", getMonthlyPay());
    }
}