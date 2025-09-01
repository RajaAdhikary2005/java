import java.util.Scanner;

class shop {
    double mrp, discount,d_price , gst, price;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Printed Price of Digital Camera: ");
        mrp = sc.nextDouble();
    }

    void calculate() {
        discount = 0.10 * mrp;
        d_price = mrp - discount;
        gst = 0.06 * d_price;
        price = d_price + gst;
    }

    void display() {
        System.out.println("\n--- Bill Details ---");
        System.out.println("Printed Price        : " + mrp);
        System.out.println("Discount (10%)       : " + discount);
        System.out.println("Price After Discount : " + d_price);
        System.out.println("GST (6%)             : " + gst);
        System.out.println("Final Price to Pay   : " + price);
    }

    public static void main(String[] args) {
        shop obj = new shop();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}
