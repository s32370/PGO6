import java.util.ArrayList;

public class ProgramTest {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();


        Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);
        Technology t = new Technology("Java", 800);
        dev.addTechnology(t);
        employees.add(dev);

        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com", "987654321", 2021);
        tester.addTestType("UI/UX");
        tester.addTestType("Integration");
        employees.add(tester);

        Manager manager = new Manager("Bob", "Johnson", "Chicago", "bob@johnson.com", "1122334455", 2019);
        Goal g = new Goal(2010, 10, 15, "Implementing FB login", 1000);
        manager.addGoal(g);
        employees.add(manager);

        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();
        }
        System.out.println("Total amount to be paid this month: " + totalAmount + " USD");

        // results
        System.out.println("\nDetails of Tester:");
        System.out.println("Name: " + tester.getFirstName() + " " + tester.getLastName());
        System.out.println("Address: " + tester.getAddress());
        System.out.println("Email: " + tester.getEmail());
        System.out.println("PESEL: " + tester.getPESEL());
        System.out.println("Year of Employment: " + tester.getYearOfEmployment());
        System.out.println("Test Types:");
        for (TestType testType : tester.getTestTypes()) {
            System.out.println("- " + testType.getType());
        }
        System.out.println("Salary: " + tester.calculateSalary() + " USD");
    }
}