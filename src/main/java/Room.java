import java.util.ArrayList;

public class Room {
    private String name;
    private int capacity;
    private ArrayList<Guest> guests;
    private boolean booked;

    public Room(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.booked = false;
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

    public boolean isBooked() {
        return this.booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }
}
