import java.util.ArrayList;

public class Room {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public int numberOfGuests() {
        return guests.size();
    }

    public void removeGuests(){
        this.guests.clear();
    }
}
