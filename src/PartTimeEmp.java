public class PartTimeEmp extends Employee {
    private int hours;
    private double hourlyRate;

    public PartTimeEmp(String name, String id, double rate) {
        super(name, id);
        this.hourlyRate = rate;
        this.hours = 0;
    }

    public void addToHours(int amount) {
        if (amount > 0) {
            this.hours += amount;
        }
    }

    @Override
    public double calculateMonthlyPay() {
        return hours * hourlyRate;
    }

    @Override
    public String getStatus() {
        return "Part-Time";
    }

    @Override
    public double getMonthlyPay() {
        return calculateMonthlyPay();
    }

    @Override
    public String toString() {
        return super.toString() + " - " + getStatus() + 
               "\nHours Worked: " + hours + 
               "\nHourly Rate: $" + String.format("%,.2f", hourlyRate) + 
               "\nMonthly Pay: $" + String.format("%,.2f", getMonthlyPay());
    }
}