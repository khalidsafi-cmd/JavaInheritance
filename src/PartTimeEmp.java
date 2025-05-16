public class PartTimeEmp extends Employee {
    private int hours;
    private double hourlyRate;

    public PartTimeEmp(String name, String id, double rate) {
        super(name, id);  // Super keyword is a usefull keyword in java that is used to refer parent class objects, and in this case, it is used to refer to the Employee class constructor
        this.hourlyRate = rate; // this sets the hourly rate for the part-time employee
        this.hours = 0; // at first we initialize the hours to 0 and then modify it later
    }

    public void addToHours(int amount) {
            this.hours = hours + amount; // this method is used to add the hours worked by the part-time employee, to the existing hours, 
                                        // so if the employee works more hours, we can add them to the existing hours through here
    }
    

    @Override
    public double calculateMonthlyPay() {
        return hours * hourlyRate; // The actual calculation of the monthly pay is done here
    }

    @Override
    public String getStatus() {
        return "Part-Time"; 
    }

    @Override
    public double getMonthlyPay() {
        return calculateMonthlyPay(); // This get method calls the calculateMonthlyPay method which calculates the monthly pay and returns it
    }

      @Override
    public String toString() {
        return super.toString() + " - " + getStatus(); // in here we have again used the super keyword to refer to the Employee class and get the name and id of the employee 
                                                     // but the status of the employee will get overridden by PartTime Class
        }
}