package deqo.jlao.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackTest {

    private Stack s1,s2;

    @Before
    public void setUp() throws Exception {
        s1 = new Stack(5);
        s2 = new Stack(5);
        s2.push(new Item(1));
        s2.push(new Item(2));
    }

    @Test (expected = EmptyStackException.class)
    public void testPeekEmpty() {
        s1.peek();
    }

    @Test
    public void testPeekStack() {
        assertEquals(new Item(2).getValue(), s2.peek().getValue());
    }

    @Test( expected = EmptyStackException.class)
    public void testPopEmpty() {
        s1.pop();
    }

    @Test
    public void testPopStack() {
        assertEquals(new Item(2).getValue(),s2.pop().getValue());
    }

    @Test
    public void testSizeEmpty() {
        assertEquals("The size of a new stack should be zero",0,s1.getSize());
    }

    @Test
    public void testSizeStack() {
        assertEquals("s2 should be equal to 2",0,s1.getSize());
    }

    @Test
    public void testEmpty() {
        assertTrue("A new stack should be empty",s1.isEmpty());
    }

    @Test
    public void testNotEmpty() {
        assertFalse("S2 should not be empty",s2.isEmpty());
    }

}