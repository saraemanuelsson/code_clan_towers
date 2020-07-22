import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room1;
    Guest guest1;

    @Before
    public void setup() {
        room1 = new Room("1", 2);
        guest1 = new Guest("Harrison");
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
}
