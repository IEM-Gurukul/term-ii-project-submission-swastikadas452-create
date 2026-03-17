class Room {
    private int roomNumber;
    private boolean isAvailable;

    // Constructor
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isAvailable = true;
    }

    // Method to book room
    public void bookRoom() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Room " + roomNumber + " booked successfully.");
        } else {
            System.out.println("Room " + roomNumber + " is not available.");
        }
    }

    // Method to free room
    public void freeRoom() {
        isAvailable = true;
        System.out.println("Room " + roomNumber + " is now available.");
    }

    // Getter methods
    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}