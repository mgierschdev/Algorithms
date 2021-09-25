import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StringSequencesTest {
    @Test
    public void baseCase(){
        StringSequences b = new StringSequences();
        List<String> expected = new LinkedList<>();
        expected.add("LLLLLDDDDD");
        expected.add("DDDDDLLLLL");
        assertEquals(expected.equals(b.findRepeatedDnaSequences("LLLLLDDDDDLLLLLDDDDDDLLLLLGGGTTT")), true);
    }
}