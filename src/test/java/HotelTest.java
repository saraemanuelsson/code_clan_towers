import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel emptyHotel;
    private Hotel hotel;
    private Room room1, bedroom2;
    private Room room2;
    private Guest guest1, guest2;
    private DiningRoom d1, d2, d3;

    @Before
    public void before(){
        emptyHotel = new Hotel();
        hotel = new Hotel();
        room1 = new Bedroom("1", 2, 50, 'D');
        bedroom2 = new Bedroom("2", 1, 10, 'S');
        room2 = new ConferenceRoom("Conference Room 1", 1, 300);
        hotel.addRoom(room1);
        hotel.addRoom(bedroom2);
        hotel.addRoom(room2);
        guest1 = new Guest("Harrison");
        guest2 = new Guest("John");
        d1 = new DiningRoom("The Eating Hall", 12);
        d2 = new DiningRoom("The Garden", 6);
        d3 = new DiningRoom("Kitchen", 1);
        hotel.addDiningRoom(d1);
        hotel.addDiningRoom(d2);
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

    @Test
    public void canGetDiningRoom(){
        assertEquals(d1, hotel.getDiningRoom("The Eating Hall"));
    }

    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(d3);
        assertEquals(3, hotel.getNumberOfDiningRooms());
    }

    @Test
    public void canGetListOfVacantRooms(){
        assertEquals(2, hotel.vacantBedrooms().size());
    }

    @Test
    public void canGetListOfVacantRoomsOneBooked(){
        bedroom2.setBooked(true);
        assertEquals(1, hotel.vacantBedrooms().size());
    }
}
