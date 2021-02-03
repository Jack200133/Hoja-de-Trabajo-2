import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraJACTest {

    @Test
    public void calculo() {
        CalculadoraJAC jc = new CalculadoraJAC();
        String st = jc.calculo("52*7*7+52*7*5*2*+");
        assertEquals("777",st);

        st = jc.calculo("5252*7**");
        assertEquals("Operacion No Valida",st);
    }
}