import org.junit.jupiter.api.Test;

class StringWithOddCountTest {
    @Test
    public void baseCase(){
        StringWithOddCount e = new StringWithOddCount();
        assertEquals(e.generateTheString(1),"a");
    }

    @Test
    public void emptyCase(){
        StringWithOddCount e = new StringWithOddCount();
        assertEquals(e.generateTheString(0),"");
    }

    @Test
    public void oddCase(){
        StringWithOddCount e = new StringWithOddCount();
        assertEquals(e.generateTheString(3),"aaa");
    }

    @Test
    public void evenCase(){
        StringWithOddCount e = new StringWithOddCount();
        assertEquals(e.generateTheString(4),"aaab");
    }

    @Test
    public void largeCase(){
        StringWithOddCount e = new StringWithOddCount();
        assertEquals(e.generateTheString(101),"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
}