import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom room1;

    @Before
    public void before(){
        room1 = new Bedroom("Room 1", 2, 50,'D');
        booking = new Booking(room1, 4);
    }

    @Test
    public void testBookingConstructor() {
        assertEquals(room1, booking.getRoom());
        assertEquals(4, booking.getNightsBooked());
    }
}
