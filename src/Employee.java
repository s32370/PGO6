class Employee {

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String PESEL;
    private int yearOfEmployment;


    public Employee(String firstName, String lastName, String address, String email, String PESEL, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.PESEL = PESEL;
        this.yearOfEmployment = yearOfEmployment;
    }


    public int calculateSalary() {
        int baseSalary = 3000;
        int yearsWorked = 2024 - yearOfEmployment;
        return baseSalary + (yearsWorked * 1000);
    }
    public void printDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("PESEL: " + PESEL);
        System.out.println("Year of Employment: " + yearOfEmployment);
    }

}
