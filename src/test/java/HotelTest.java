import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Room room1;
    private Room room2;

    @Before
    public void before(){
        hotel = new Hotel();
        room1 = new Bedroom("1", 2, 'D');
        room2 = new ConferenceRoom("Conference Room 1", 1);
    }

    @Test
    public void testAddingRooms() {
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        assertEquals(2, hotel.numberOfRooms());
    }
}
