import java.util.Scanner;

public class Adam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sq = n * n;
        int rev = reverse(n);
        int revSq = rev * rev;

        if (sq == reverse(revSq)) {
            System.out.println(n + " is an Adam Number.");
        } else {
            System.out.println(n + " is not an Adam Number.");
        }
        sc.close();
    }

    // Helper function to reverse a number
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}
