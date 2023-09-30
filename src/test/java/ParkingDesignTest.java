import Design.ParkingDesign;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingDesignTest {
    @Test
    public void baseCase(){
        ParkingDesign c = new ParkingDesign(1, 1, 0);
        assertEquals(c.addCar(1), true);
        assertEquals(c.addCar(2), true);
        assertEquals(c.addCar(3), false);
        assertEquals(c.addCar(1), false);
    }
}