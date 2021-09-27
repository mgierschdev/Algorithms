import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import java.util.LinkedList;


class CheckerTest {
    @Test
    public void baseTest(){
        LinkedList<Player> players = new LinkedList<>();
        LinkedList<Player> expectedResult = new LinkedList<Player>();

        players.add(new Player("amy", 100));
        players.add(new Player("david", 100));
        players.add(new Player("heraldo", 50));
        players.add(new Player("aakansha", 75));
        players.add(new Player("aleksa", 150));

        expectedResult.add(new Player("aleksa", 150));
        expectedResult.add(new Player("amy", 100));
        expectedResult.add(new Player("david", 100));
        expectedResult.add(new Player("aakansha", 75));
        expectedResult.add(new Player("heraldo", 50));

        Collections.sort(players, new Checker());

        // This is not an object comparator
        for (int i = 0; i < players.size(); i++) {
            assertEquals(players.get(i).name, expectedResult.get(i).name);
            assertEquals(players.get(i).score, expectedResult.get(i).score);
        }
    }

}