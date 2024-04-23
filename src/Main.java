import java.util.ArrayList;


class Developer extends Employee {

    private ArrayList<Technology> technologies;


    public Developer(String firstName, String lastName, String address, String email, String PESEL, int yearOfEmployment) {
        super(firstName, lastName, address, email, PESEL, yearOfEmployment);
        this.technologies = new ArrayList<>();
    }


    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }


    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        for (Technology tech : technologies) {
            bonus += tech.getBonus();
        }
        return baseSalary + bonus;
    }
}

class Manager extends Employee {
    private ArrayList<Goal> goals;
    public Manager(String firstName, String lastName, String address, String email, String PESEL, int yearOfEmployment) {
        super(firstName, lastName, address, email, PESEL, yearOfEmployment);
        this.goals = new ArrayList<>();
    }
    public void addGoal(Goal goal) {
        goals.add(goal);
    }
    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        for (Goal goal : goals) {
            if (goal.isAchievedInCurrentMonth()) {
                bonus += goal.getBonusAmount();
            }
        }
        return baseSalary + bonus;
    }
}
class Technology {
    private String name;
    private int bonus;

    public Technology(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }
}


class Goal {
    private int year;
    private int month;
    private int day;
    private String name;
    private int bonusAmount;

    public Goal(int year, int month, int day, String name, int bonusAmount) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        this.bonusAmount = bonusAmount;
    }

    public boolean isAchievedInCurrentMonth() {
        return year == 2024 && month == 4;
    }

    public int getBonusAmount() {
        return bonusAmount;
    }
}

//testing

public class ProgramTest {
    public static void main(String[] args) {
        Employee emp = new Employee("John", "Doe", "New York", "john@doe.com", "123456789", 2020);
        emp.printDetails();
    }
}
