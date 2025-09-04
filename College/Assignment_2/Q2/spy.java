import java.util.Scanner;

public class spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0, product = 1, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            product *= d;
            temp /= 10;
        }

        if (sum == product) {
            System.out.println(n + " is a Spy Number.");
        } else {
            System.out.println(n + " is not a Spy Number.");
        }
        sc.close();
    }
}
