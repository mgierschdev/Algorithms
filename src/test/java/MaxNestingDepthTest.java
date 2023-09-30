import Array.MaxNestingDepth;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxNestingDepthTest {
    @Test
    public void baseCase(){
        MaxNestingDepth c = new MaxNestingDepth();
        Assertions.assertEquals(c.maxDepth("(1+(2*3)+((8)/4))+1"), 3);
    }
}