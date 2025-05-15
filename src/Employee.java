public class Employee {
    private String name;
    private String IDNum;

    public Employee(String name, String id) {
        this.name = name;
        this.IDNum = id;
    }

    public String getIDNum() {
        return IDNum;
    }

    public String getName() {
        return name;
    }

    public double calculateMonthlyPay() {
        return 0.0;
    }

    public String toString() {
        return "Employee: " + name + " (ID: " + IDNum + ")";
    }

    public double getMonthlyPay() {
        return calculateMonthlyPay();
    }

    public String getStatus() {
        return "Generic Employee";
    }
}