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
        return 0.0; // This method is meant to be overridden by subclasses, but it returns 0.0 by default if we call it from the Employee class
    }

    public String toString() {
        return "Employee: " + name + " (ID: " + IDNum + ")"; // This method returns the name and ID of the employee
    }

    public double getMonthlyPay() {
        return calculateMonthlyPay(); // This method calls the calculateMonthlyPay method which calculates the monthly pay and returns it however it is overridden in subclasseses
    }

    public String getStatus() {
        return "Employee"; // This method returns the status of the employee, which is overridden in subclasses, 
    }
}