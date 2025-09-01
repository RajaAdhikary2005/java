import java.util.Scanner;

class movieMagic {
    // Instance variables
    int year;
    String title;
    float rating;

    // Default constructor
    movieMagic() {
        year = 0;
        title = "";
        rating = 0.0f;
    }

    // Method to accept details
    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie title: ");
        title = sc.nextLine();

        System.out.print("Enter year of release: ");
        year = sc.nextInt();

        System.out.print("Enter rating (0.0 to 5.0): ");
        rating = sc.nextFloat();
    }

    // Method to display details
    void display() {
        String message = "";

        if (rating >= 0.0 && rating <= 2.0) {
            message = "Flop";
        } else if (rating >= 2.1 && rating <= 3.4) {
            message = "Semi-hit";
        } else if (rating >= 3.5 && rating <= 4.5) {
            message = "Hit";
        } else if (rating >= 4.6 && rating <= 5.0) {
            message = "Super Hit";
        } else {
            message = "Invalid Rating!";
        }

        System.out.println("\n--- Movie Details ---");
        System.out.println("Title  : " + title);
        System.out.println("Year   : " + year);
        System.out.println("Rating : " + rating);
        System.out.println("Verdict: " + message);
    }

    // Main method for testing
    public static void main(String[] args) {
        movieMagic obj = new movieMagic();
        obj.accept();
        obj.display();
    }
}
