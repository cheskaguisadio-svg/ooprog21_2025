import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("How many hours did you work this week? ");
            double hoursWorked = scanner.nextDouble();

            System.out.print("What is your regular pay rate? ");
            double payRate = scanner.nextDouble();

            
            int employeeNumber = 1001;

            Employee employee = new Employee(employeeNumber, payRate);

            double regularPay = employee.calculateRegularPay(hoursWorked);
            double overtimePay = employee.calculateOvertimePay(hoursWorked);

            
            System.out.println("Regular pay is " + regularPay);
            System.out.println("Overtime pay is " + overtimePay);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
