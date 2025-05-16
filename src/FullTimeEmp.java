public class FullTimeEmp extends Employee {
    private double salary;

    public FullTimeEmp(String name, String id, double salary) {
        super(name, id); // Super keyword is a usefull keyword in java that is used to refer parent class objects, and in this case, it is used to refer to the Employee class constructor
        this.salary = salary; 
    }

    @Override
    public String getStatus() {
        return "Full-Time";
    }

    @Override
    public double getMonthlyPay() {
        return salary; // Full-time employees have a fixed monthly salary that is why its just returning salary. 
    }

    @Override
    public String toString() {
        return super.toString() + " - " + getStatus(); // Again we have used the super keyword to refer to the Employee class and get the name and id of the employee 
                                                      // but the status of the employee will get overridden by FullTime Class
    }
}