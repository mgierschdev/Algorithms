import Array.SpecialArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpecialArrayTest {
    @Test
    public void baseCase(){
        SpecialArray c = new SpecialArray();
        Assertions.assertEquals(c.specialArray(new int[]{3, 5}), 2);
    }

    @Test
    public void secondCase(){
        SpecialArray c = new SpecialArray();
        Assertions.assertEquals(c.specialArray(new int[]{0, 0}), -1);
    }

    @Test
    public void thirdCase(){
        SpecialArray c = new SpecialArray();
        Assertions.assertEquals(c.specialArray(new int[]{2, 3, 6, 8, 10, 13}), 4);
    }
}