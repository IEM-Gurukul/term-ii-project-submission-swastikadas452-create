import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookingManager manager = new BookingManager();

        int choice;

        do {
            System.out.println("\n===== Hotel Booking System =====");
            System.out.println("1. Add Room");
            System.out.println("2. Add Customer");
            System.out.println("3. Book Room");
            System.out.println("4. View Bookings");
            System.out.println("5. View Customers");
            System.out.println("6. Cancel Booking");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                // ⭐ Dynamic Room Creation (Inheritance)
                case 1:
                    System.out.println("Select Room Type:");
                    System.out.println("1. Standard");
                    System.out.println("2. Deluxe");
                    System.out.println("3. Premium");

                    int type = sc.nextInt();

                    System.out.print("Enter Room Number: ");
                    int roomNo = sc.nextInt();

                    Room room = null;

                    switch (type) {
                        case 1:
                            room = new StandardRoom(roomNo);
                            break;
                        case 2:
                            room = new DeluxeRoom(roomNo);
                            break;
                        case 3:
                            room = new PremiumRoom(roomNo);
                            break;
                        default:
                            System.out.println("Invalid room type!");
                            break;
                    }

                    if (room != null) {
                        manager.addRoom(room);
                        System.out.println("✅ Room added successfully!");
                    }
                    break;

                // Add Customer
                case 2:
                    System.out.print("Enter Customer ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    Customer c = new Customer(id, name, phone, email);
                    manager.addCustomer(c);

                    System.out.println("✅ Customer added!");
                    break;

                // Book Room
                case 3:
                    System.out.print("Enter Booking ID: ");
                    int bookingId = sc.nextInt();

                    System.out.print("Enter Customer ID: ");
                    int custId = sc.nextInt();

                    System.out.print("Enter Room Number: ");
                    int rNo = sc.nextInt();

                    manager.bookRoom(bookingId, custId, rNo);
                    break;

                // View Bookings
                case 4:
                    manager.showAllBookings();
                    break;

                // View Customers
                case 5:
                    manager.showAllCustomers();
                    break;

                // Cancel Booking
                case 6:
                    System.out.print("Enter Booking ID: ");
                    int cancelId = sc.nextInt();

                    manager.cancelBooking(cancelId);
                    break;

                case 7:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}