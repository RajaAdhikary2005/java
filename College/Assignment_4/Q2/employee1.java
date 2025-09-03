import java.util.Scanner;

class employee {
    public int salary;

    // Constructor
    employee(int salary) {
        this.salary = salary;
    }

    void workingsatatus() {
        System.out.println("I am an employee");
    }

    int getsalary() {
        System.out.println("My salary is " + this.salary);
        return this.salary;
    }
}

class HRManager extends employee {
    // Constructor
    HRManager(int salary) {
        super(salary);
    }

    @Override
    void workingsatatus() {
        System.out.println("I am a HR manager");
    }

    void addemployee() {
        System.out.println("Add new Employee");
    }
}

public class employee1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your salary:");
        int salary = sc.nextInt();

        employee e1 = new employee(salary);
        e1.workingsatatus();
        e1.getsalary();

        HRManager hr1 = new HRManager(salary);
        hr1.workingsatatus();
        hr1.addemployee();

        sc.close();
    }
}
