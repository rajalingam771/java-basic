package AccessModifiers;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee();

        // Public - accessible
        System.out.println(emp.employeeId);

        // Protected - accessible here because Main
        // is in the same package
        System.out.println(emp.salary);

        // Default - accessible because same package
        System.out.println(emp.department);

        // Private - NOT directly accessible
        // System.out.println(emp.name); // ❌

        // Access private data through public method
        emp.displayPrivateData();
    }
}
