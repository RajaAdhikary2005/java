import java.util.Scanner;

public class buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Buzz Number
        System.out.print("Enter a number to check Buzz Number: ");
        int num1 = sc.nextInt();
        if (num1 % 7 == 0 || num1 % 10 == 7) {
            System.out.println(num1 + " is a Buzz Number.");
        } else {
            System.out.println(num1 + " is not a Buzz Number.");
        }
    }}