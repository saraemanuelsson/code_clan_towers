import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room1;
    Guest guest1, guest2;

    @Before
    public void setup() {
        room1 = new Room("1", 2);
        guest1 = new Guest("Harrison");
        guest2 = new Guest("John");
    }

    @Test
    public void testRoomConstructor() {
        assertEquals("1", room1.getName());
        assertEquals(2, room1.getCapacity());
    }

    @Test
    public void canAddGuest(){
        room1.addGuest(guest1);
        assertEquals(1, room1.numberOfGuests());
    }

    @Test
    public void canRemoveGuests(){
        room1.addGuest(guest1);
        room1.addGuest(guest2);
        room1.removeGuests();
        assertEquals(0, room1.numberOfGuests());
    }

    @Test
       public void canSetBook(){
        room1.setBooked(true);
        assertEquals(true, room1.isBooked());
    }
}
