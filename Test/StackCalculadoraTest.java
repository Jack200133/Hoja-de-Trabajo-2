import org.junit.Test;

import static org.junit.Assert.*;

public class StackCalculadoraTest {

    @Test
    public void push() {
        StackCalculadora<Integer> fe = new StackCalculadora<Integer>();
        fe.push(12);
        fe.push(3);

        assertEquals(2,fe.size());
    }

    @Test
    public void pop() {
        StackCalculadora<Integer> fe = new StackCalculadora<Integer>();
        fe.push(12);
        int aph = fe.pop();

        assertEquals(12,aph);
    }

    @Test
    public void empty() {
        StackCalculadora<Integer> fe = new StackCalculadora<Integer>();
        fe.push(12);
        boolean sera = fe.empty();
        assertFalse(sera);
    }
}