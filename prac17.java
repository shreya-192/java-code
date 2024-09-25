class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

   
    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }

    // Method to display Employee details
    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        printSalary(); // Call method from Member class
    }
}

// Manager class that inherits from Member
class Manager extends Member {
    String department;

    // Constructor to initialize Manager data members
    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    // Method to display Manager details
    void displayManagerDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        printSalary(); // Call method from Member class
    }
}

// Main class to test the functionality
public class prac17 {
    public static void main(String[] args) {
        // Create an Employee object and assign values
        Employee employee = new Employee("Alice", 30, "123-456-7890", "123 Main St", 50000, "Software Engineering");
        // Display Employee details
        employee.displayEmployeeDetails();

        System.out.println();

        // Create a Manager object and assign values
        Manager manager = new Manager("Bob", 40, "098-765-4321", "456 Elm St", 80000, "IT Department");
        // Display Manager details
        manager.displayManagerDetails();
        System.out.println("23DIT052 SHREYA PATEL");
    }
}

