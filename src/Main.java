public class Main {
    public static void main(String[] args) {
        
        System.out.println("===== Employee Management System =====");

        
        FullTimeEmp ft = new FullTimeEmp("Sarah Johnson", "FT202", 5000.00);
        PartTimeEmp pt = new PartTimeEmp("Michael Chen", "PT307", 18.75);

        System.out.println("\n[Full-Time Employee Created]");
        
        System.out.println(ft.toString());
        System.out.println("Monthly Pay: $" + ft.getMonthlyPay());
        System.out.println("Status: " + ft.getStatus());

        System.out.println(pt.toString());
        System.out.println("Monthly Pay: $" + pt.getMonthlyPay());
        System.out.println("Status: " + pt.getStatus());
        // Create and display a part-time employee
        
        pt.addToHours(160); // Add hours worked

        System.out.println("\n[Part-Time Employee Created]");
        System.out.println(pt);
        
        pt.addToHours(15);
        System.out.println("\n[Added 15 more hours to part-time employee]");
        System.out.println("Updated Monthly Pay: $" + String.format("%,.2f", ptEmployee.getMonthlyPay()));
        
      
    }
    
}