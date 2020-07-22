import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest1;

    @Before
    public void setup() {
        guest1 = new Guest("Harrison");
    }

    @Test
    public void testGuestConstructor() {
        assertEquals("Harrison", guest1.getName());
    }
}
