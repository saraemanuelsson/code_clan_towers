import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room1;

    @Before
    public void setup() {
        room1 = new Room("1", 2);
    }

    @Test
    public void testRoomConstructor() {
        assertEquals("1", room1.getName());
        assertEquals(2, room1.getCapacity());
    }
}
