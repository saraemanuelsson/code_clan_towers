import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Room> rooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(){
        this.rooms = new ArrayList<Room>();
        this.diningRooms = new HashMap<String, DiningRoom>();
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
        if (!room.isBooked()) {
            room.addGuest(guest);
        }
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
    
    public void addDiningRoom(DiningRoom room) {
        diningRooms.put(room.getName(), room);
    }

    public DiningRoom getDiningRoom(String name){
        return this.diningRooms.get(name);
    }

    public int getNumberOfDiningRooms(){
        return this.diningRooms.size();
    }

    public ArrayList<Bedroom> vacantBedrooms() {
        ArrayList<Bedroom> bedrooms = new ArrayList<Bedroom>();
        for (Room room : this.rooms) {
            if (room instanceof Bedroom && !room.isBooked()) {
                bedrooms.add((Bedroom)room);
            }
        }
        return bedrooms;
    }
}
