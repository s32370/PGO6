import java.util.ArrayList;

class Tester extends Employee {
    private ArrayList<TestType> testTypes;

    public Tester(String firstName, String lastName, String address, String email, String PESEL, int yearOfEmployment) {
        super(firstName, lastName, address, email, PESEL, yearOfEmployment);
        this.testTypes = new ArrayList<>();
    }

    public void addTestType(String testType) {
        testTypes.add(new TestType(testType));
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = testTypes.size() * 300;
        return baseSalary + bonus;
    }
}