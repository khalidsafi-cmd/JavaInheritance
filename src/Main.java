public class Main {
    public static void main(String[] args) {
        
        System.out.println("===== Employee Management System =====");

    // Crearting objects of both fulltime and parttime employees 
        FullTimeEmp ft = new FullTimeEmp("Farhat Akbarzadah", "49401", 5000.00);
        PartTimeEmp pt = new PartTimeEmp("Rukhsar Khairi", "49561", 15.00);

        // Displaying details of full time employees
        System.out.println("\n-----Full-Time Employees-----");
        System.out.println(ft.toString());
        System.out.println("Monthly Pay: $" + ft.getMonthlyPay());
        System.out.println("Status: " + ft.getStatus());


        pt.addToHours(160); // Add hours worked
        // Displaying details of part time employees
         System.out.println("\n-----Part-Time Employees-----");
        System.out.println(pt.toString());
        System.out.println("Monthly Pay: $" + pt.getMonthlyPay());
        System.out.println("Status: " + pt.getStatus());

        // Adding more hours to part-time employee if they work more hours
        pt.addToHours(15);
        System.out.println("\nAdded 15 more hours to part-time employee");
        System.out.println("Updated Monthly Pay: $" +  pt.getMonthlyPay());
    }
    
}