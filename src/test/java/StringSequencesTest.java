import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import String.StringSequences;

class StringSequencesTest {
    @Test
    public void baseCase(){
        StringSequences b = new StringSequences();
        List<String> expected = new LinkedList<>();
        expected.add("LLLLLDDDDD");
        expected.add("DDDDDLLLLL");
        assertEquals(expected, b.findRepeatedDnaSequences("LLLLLDDDDDLLLLLDDDDDDLLLLLGGGTTT"));
    }
}