import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel emptyHotel;
    private Hotel hotel;
    private Room room1;
    private Room room2;

    @Before
    public void before(){
        emptyHotel = new Hotel();
        hotel = new Hotel();
        room1 = new Bedroom("1", 2, 'D');
        room2 = new ConferenceRoom("Conference Room 1", 1);
        hotel.addRoom(room1);
        hotel.addRoom(room2);
    }

    @Test
    public void testAddingRooms() {
        emptyHotel.addRoom(room1);
        emptyHotel.addRoom(room2);
        assertEquals(2, emptyHotel.numberOfRooms());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkGuestIn()
//    }

    @Test
    public void findByName(){
        assertEquals(room2, hotel.findRoomByName("Conference Room 1"));
    }
}
