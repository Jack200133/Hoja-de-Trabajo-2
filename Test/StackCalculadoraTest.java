/** Test para probar que el stack si pueda agregar items al vector, eliminarlos y verificar que este vacio*/
import org.junit.Test;

import static org.junit.Assert.*;

public class StackCalculadoraTest {

    @Test
    public void push() {
        StackVector<Integer> fe = new StackVector<Integer>();
        fe.push(12);
        fe.push(3);

        assertEquals(2,fe.size());
    }

    @Test
    public void pop() {
        StackVector<Integer> fe = new StackVector<Integer>();
        fe.push(12);
        int aph = fe.pop();

        assertEquals(12,aph);
    }

    @Test
    public void empty() {
        StackVector<Integer> fe = new StackVector<Integer>();
        fe.push(12);
        boolean sera = fe.empty();
        assertFalse(sera);
    }
}