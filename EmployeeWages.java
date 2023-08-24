import java.util.Scanner;

class Employee {
    String name;
    String employeeId;
    double hoursWorked;
    double wages;

    Employee(String name, String employeeId, double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.wages = hoursWorked * 100; // Assuming the wage rate is Rs. 100 per hour
    }
}

public class EmployeeWages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an array to store employee objects
        Employee[] employees = new Employee[5];

        // Input details for 5 employees
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            String employeeId = scanner.nextLine();
            System.out.print("Hours worked: ");
            double hoursWorked = Double.parseDouble(scanner.nextLine());

            // Create an Employee object and store it in the array
            employees[i] = new Employee(name, employeeId, hoursWorked);

        }
        double max= employees[0].wages;
        for(int i=0;i<5;i++){
            if(max<employees[i].wages) {
                max = employees[i].wages;
            }
        }

        // Display information in tabular format
        System.out.println("\nEmployee Details:");
        System.out.println(String.format("%-15s %-10s %-15s %-10s", "ID", "Name", "Hours Worked", "Wages"));
        System.out.println("============================================");
        for (Employee employee : employees) {
            System.out.println(String.format("%-15s %-10s %-15s %-10s", employee.employeeId, employee.name, employee.hoursWorked, employee.wages));
        }

        for(int i=0;i<5;i++){
            if(max==employees[i].wages){
                System.out.println("The Details of highest paid worker is : ");
                System.out.println(String.format("%-15s %-10s %-15s %-10s", "ID", "Name", "Hours Worked", "Wages"));
                System.out.println(String.format("%-15s %-10s %-15s %-10s", employees[i].employeeId, employees[i].name, employees[i].hoursWorked, employees[i].wages));
            }
        }

        scanner.close();
    }
}
