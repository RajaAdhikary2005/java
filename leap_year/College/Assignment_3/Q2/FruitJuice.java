import java.util.Scanner;

class FruitJuice {
    // Instance variables
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;

    // Default constructor
    FruitJuice() {
        product_code = 0;
        flavour = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }

    // Method to input details
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product code: ");
        product_code = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter flavour: ");
        flavour = sc.nextLine();

        System.out.print("Enter pack type: ");
        pack_type = sc.nextLine();

        System.out.print("Enter pack size (ml): ");
        pack_size = sc.nextInt();

        System.out.print("Enter product price: ");
        product_price = sc.nextInt();
    }

    // Method to reduce price by 10
    void discount() {
        product_price = product_price - 10;
    }

    // Method to display details
    void display() {
        System.out.println("\n--- Product Details ---");
        System.out.println("Product Code   : " + product_code);
        System.out.println("Flavour        : " + flavour);
        System.out.println("Pack Type      : " + pack_type);
        System.out.println("Pack Size      : " + pack_size + " ml");
        System.out.println("Product Price  : Rs. " + product_price);
    }

    // Main method to test
    public static void main(String[] args) {
        FruitJuice obj = new FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
} 
