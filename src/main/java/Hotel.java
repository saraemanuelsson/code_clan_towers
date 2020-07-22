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
}
