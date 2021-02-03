import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraJACTest {

    @Test
    public void calculo() {
        CalculadoraJAC jc = new CalculadoraJAC();
        String st = jc.calculo("1 2 3 / 4 * + 5 - 6 7 *+");
        assertEquals("38",st);

        st = jc.calculo("5252*7**");
        assertEquals("Operacion No Valida",st);
    }
}