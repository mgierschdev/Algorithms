import Array.ContainerWithMostWater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    @Test
    public void BaseTest() {
        ContainerWithMostWater c = new ContainerWithMostWater();
        Assertions.assertEquals(c.calculate(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49);
        Assertions.assertEquals(c.calculate(new int[]{1, 1}), 1);
        Assertions.assertEquals(c.calculate(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7,9,19,9,10}), 88);
        Assertions.assertEquals(c.calculate(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7,9,19,9,10}), 88);
    }
}