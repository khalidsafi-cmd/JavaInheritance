public class Main {
    public static void main(String[] args) {
        System.out.println("===== Employee Management System =====");
        
        // Create and display a full-time employee
        FullTimeEmp ftEmployee = new FullTimeEmp("Sarah Johnson", "FT202", 75000);
        System.out.println("\n[Full-Time Employee Created]");
        System.out.println(ftEmployee);
        
        // Create and display a part-time employee
        PartTimeEmp ptEmployee = new PartTimeEmp("Michael Chen", "PT307", 18.75);
        ptEmployee.addToHours(95); // Add hours worked
        System.out.println("\n[Part-Time Employee Created]");
        System.out.println(ptEmployee);
        
        // Demonstrate adding more hours
        ptEmployee.addToHours(15);
        System.out.println("\n[Added 15 more hours to part-time employee]");
        System.out.println("Updated Monthly Pay: $" + String.format("%,.2f", ptEmployee.getMonthlyPay()));
        
        // Display all employee statuses
        System.out.println("\n[Employee Status Report]");
        displayEmployeeStatus(ftEmployee);
        displayEmployeeStatus(ptEmployee);
    }
    
    public static void displayEmployeeStatus(Employee emp) {
        System.out.println(emp.getName() + " (" + emp.getIDNum() + "): " + 
                          emp.getStatus() + " - $" + 
                          String.format("%,.2f", emp.getMonthlyPay()) + "/month");
    }
}