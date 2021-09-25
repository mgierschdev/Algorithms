import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinDominoRotationTest {
    @Test
    public void baseCase(){
        MinDominoRotation d = new MinDominoRotation();
        assertEquals(d.minDominoRotations(new int[]{2,1,2,4,2,2}, new int[]{5,2,6,2,3,2}), 2);
    }

    @Test
    public void equalCase(){
        MinDominoRotation d = new MinDominoRotation();
        assertEquals(d.minDominoRotations(new int[]{2,2,2,2,2,2}, new int[]{5,2,6,2,3,2}), 0);
    }

    @Test
    public void allEqualCase(){
        MinDominoRotation d = new MinDominoRotation();
        assertEquals(d.minDominoRotations(new int[]{2,2,2,2,2,2}, new int[]{2,2,2,2,2,2}), 0);
    }

    @Test
    public void impossibleCase(){
        MinDominoRotation d = new MinDominoRotation();
        assertEquals(d.minDominoRotations(new int[]{5,2,6,2,3,2}, new int[]{5,2,6,2,3,2}), -1);
    }
}