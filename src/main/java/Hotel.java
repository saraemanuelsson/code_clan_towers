import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel(){
        this.rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    public int numberOfRooms() {
        return this.rooms.size();
    }

    public Room findRoomByName(String roomName) {
        for (Room room : this.rooms){
            if (room.getName() == roomName){
                return room;
            }
        }
        return null;
    }

    public void checkGuestIn(String roomName, Guest guest) {
        Room room = findRoomByName(roomName);
        room.addGuest(guest);
    }

    public void checkOutGuests(String roomName){
        Room room = findRoomByName(roomName);
        room.removeGuests();
    }

    public Booking bookRoom(Room room, int nights) {
        Booking booking = new Booking(room, nights);
        room.setBooked(true);
        return booking;
    }
}
