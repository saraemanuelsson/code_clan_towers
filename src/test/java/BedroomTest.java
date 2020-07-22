import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom room1;

    @Before
    public void setup() {
        room1 = new Bedroom("1", 2, 50, 'D');
    }

    @Test
    public void testBedroomConstructor() {
        assertEquals("1", room1.getName());
        assertEquals(2, room1.getCapacity());
        assertEquals('D', room1.getType());
    }
}
