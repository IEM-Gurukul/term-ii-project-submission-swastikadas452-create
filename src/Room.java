class Room {
    private int roomNumber;
    private boolean isAvailable;
    private String roomType;

    // Constructor
    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;
    }

    // Book room
    public void bookRoom() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(roomType + " Room " + roomNumber + " booked successfully.");
        } else {
            System.out.println(roomType + " Room " + roomNumber + " is not available.");
        }
    }

    // Free room
    public void freeRoom() {
        isAvailable = true;
        System.out.println(roomType + " Room " + roomNumber + " is now available.");
    }

    // Getters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Display details
    public void displayRoom() {
        System.out.println("Room No: " + roomNumber + " | Type: " + roomType + " | Available: " + isAvailable);
    }
}