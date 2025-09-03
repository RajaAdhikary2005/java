import java.util.Scanner;
class BankAccount{
    public String accountNumber;
    public double balance;
    BankAccount(String accountNumber , double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void deposit(double amount){
        balance=balance+amount;
        System.out.println(amount+"Amount Deposited");
    }
    void withdraw(double amount){
        balance=balance-amount;
        System.out.println(amount+"Amount Withdraned");
    }
    double getBalance(){
        System.out.println("Balance is"+balance);
        return balance;
    }
}
class savingsAccount extends BankAccount{
    savingsAccount(String accountNumber,double balance){
        super(accountNumber,balance);
    }
    void withdraw(double amount){
    if (amount<100){
        System.out.println("Cannot be withdrawned");
    }else{
        balance=balance-amount;
        System.out.println(amount+"amount withdrawn");
    }
}}
public class bank {
    public static void main(String[] args){
    String accountNumber;
    double balance;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your account number");
    accountNumber=sc.nextLine();
    System.out.println("Enter your balance");
    balance=sc.nextDouble();
    sc.close();
    BankAccount b1=new BankAccount(accountNumber, balance);
    b1.deposit(1000);
    b1.withdraw(2000);
    b1.getBalance();
    savingsAccount s1=new savingsAccount(accountNumber, balance);
    s1.deposit(1000);
    s1.withdraw(500);
    s1.getBalance();
}}
