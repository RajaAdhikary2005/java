import java.util.*;

public class Javabasics {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int a=sc.nextInt();
        System.out.print("Enter Second number: "); 
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("Sum of the two number is: "+sum);
        sc.close();
    }
}