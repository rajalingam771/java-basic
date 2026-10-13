package AccessModifiers;

public class Employee {

    // Private
    private String name = "Raj";

    // Public
    public int employeeId = 101;

    // Protected
    protected double salary = 50000;

    // Default
    String department = "IT";

    // Public method to access private variable
    public void displayPrivateData() {
        System.out.println("Name: " + name);
    }
}