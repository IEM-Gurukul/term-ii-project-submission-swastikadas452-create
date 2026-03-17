import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BookingManager manager = new BookingManager();

        // Sample rooms
        manager.addRoom(new Room(101, "Standard"));
        manager.addRoom(new Room(102, "Deluxe"));
        manager.addRoom(new Room(103, "Premium"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Hotel Booking System =====");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Add Customer");
            System.out.println("3. Book Room");
            System.out.println("4. Update Customer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {


                case 1:
                    System.out.print("Enter Customer ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    manager.addCustomer(new Customer(id, name, phone, email));
                    System.out.println("Customer added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Room Number: ");
                    int roomNo = sc.nextInt();

                    System.out.print("Enter Customer ID: ");
                    int custId = sc.nextInt();

                    manager.bookRoom(1, custId, roomNo);
                    break;

                case 3:
                    System.out.print("Enter Customer ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Phone: ");
                    String newPhone = sc.nextLine();

                    System.out.print("Enter New Email: ");
                    String newEmail = sc.nextLine();

                    break;

                case 4:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}