import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlertUserLogTest {
    @Test
    public void baseCase(){
        AlertUserLog e = new AlertUserLog();
        List<String> result = e.alertNames(new String[]{"daniel","daniel","daniel","luis","luis","luis","luis"}, new String[]{"10:00","10:40","11:00","09:00","11:00","13:00","15:00"});
        List<String> expected = new LinkedList<>();
        expected.add("daniel");
        assertEquals(result.equals(expected), true);
    }

    @Test
    public void secondCase(){
        AlertUserLog e = new AlertUserLog();
        List<String> result = e.alertNames(new String[]{"alice","alice","alice","bob","bob","bob","bob"}, new String[]{"12:01","12:00","18:00","21:00","21:20","21:30","23:00"});
        List<String> expected = new LinkedList<>();
        expected.add("bob");
        assertEquals(result.equals(expected), true);
    }

    @Test
    public void thirdCase(){
        AlertUserLog e = new AlertUserLog();
        List<String> result = e.alertNames(new String[]{"john","john","john"}, new String[]{"23:58","23:59","00:01"});
        List<String> expected = new LinkedList<>();
        assertEquals(result.equals(expected), true);
    }

    @Test
    public void fourthCase(){
        AlertUserLog e = new AlertUserLog();
        List<String> result = e.alertNames(new String[]{"leslie","leslie","leslie","clare","clare","clare","clare"}, new String[]{"13:00","13:20","14:00","18:00","18:51","19:30","19:49"});
        List<String> expected = new LinkedList<>();
        expected.add("clare");
        expected.add("leslie");
        assertEquals(result.equals(expected), true);
    }
}