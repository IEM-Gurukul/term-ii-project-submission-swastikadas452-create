class Room {
    private int roomNumber;
    private boolean isAvailable;
    private String roomType;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;
    }

    public void bookRoom() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(roomType + " Room " + roomNumber + " booked successfully.");
        } else {
            System.out.println("Room not available.");
        }
    }

    public void freeRoom() {
        isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void displayRoom() {
        System.out.println("Room No: " + roomNumber + " | Type: " + roomType + " | Available: " + isAvailable);
    }
}