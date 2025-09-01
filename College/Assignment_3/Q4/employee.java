import java.util.Scanner;

class employee {
    double basicPay, da, hra, pf, grossPay, netPay;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Pay of Employee: ");
        basicPay = sc.nextDouble();
    }

    void calculate() {
        da = 0.30 * basicPay;    // Dearness Allowance
        hra = 0.15 * basicPay;   // House Rent Allowance
        pf = 0.125 * basicPay;   // Provident Fund

        grossPay = basicPay + da + hra;
        netPay = grossPay - pf;
    }

    void display() {
        System.out.println("\n--- Salary Details ---");
        System.out.println("Basic Pay      : " + basicPay);
        System.out.println("DA (30%)       : " + da);
        System.out.println("HRA (15%)      : " + hra);
        System.out.println("PF (12.5%)     : " + pf);
        System.out.println("Gross Pay      : " + grossPay);
        System.out.println("Net Pay        : " + netPay);
    }

    public static void main(String[] args) {
        employee emp = new employee();
        emp.accept();
        emp.calculate();
        emp.display();
    }
}
