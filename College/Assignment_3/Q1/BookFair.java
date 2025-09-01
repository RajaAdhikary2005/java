import java.util.Scanner;

class BookFair {
    // Instance variables
    String Bname;
    double price;

    // Default constructor
    BookFair() {
        Bname = "";
        price = 0.0;
    }

    // Method to input book details
    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the book: ");
        Bname = sc.nextLine();
        System.out.print("Enter the price of the book: ");
        price = sc.nextDouble();
    }

    // Method to calculate discount and update price
    void calculate() {
        if (price <= 1000) {
            price = price - (price * 2 / 100.0);
        } else if (price > 1000 && price <= 3000) {
            price = price - (price * 10 / 100.0);
        } else if (price > 3000) {
            price = price - (price * 15 / 100.0);
        }
    }

    // Method to display details
    void display() {
        System.out.println("\nBook Name: " + Bname);
        System.out.println("Price after discount: " + price);
    }

    // Main method
    public static void main(String[] args) {
        BookFair obj = new BookFair();
        obj.Input();
        obj.calculate();
        obj.display();
    }
}
