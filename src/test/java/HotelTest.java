import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel emptyHotel;
    private Hotel hotel;
    private Room room1;
    private Room room2;
    private Guest guest1, guest2;

    @Before
    public void before(){
        emptyHotel = new Hotel();
        hotel = new Hotel();
        room1 = new Bedroom("1", 2, 'D');
        room2 = new ConferenceRoom("Conference Room 1", 1);
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        guest1 = new Guest("Harrison");
        guest2 = new Guest("John");
    }

    @Test
    public void testAddingRooms() {
        emptyHotel.addRoom(room1);
        emptyHotel.addRoom(room2);
        assertEquals(2, emptyHotel.numberOfRooms());
    }

    @Test
    public void findByName(){
        assertEquals(room2, hotel.findRoomByName("Conference Room 1"));
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkGuestIn("1", guest1);
        assertEquals(1, room1.numberOfGuests());
    }

    @Test
    public void canCheckOutGuests(){
        hotel.checkGuestIn("1", guest1);
        hotel.checkGuestIn("1", guest2);
        hotel.checkOutGuests("1");
        assertEquals(0, room1.numberOfGuests());
    }

    @Test
    public void canBookRoom(){
        hotel.bookRoom(room1, 5);
        assertEquals(true, room1.isBooked());
    }
}
