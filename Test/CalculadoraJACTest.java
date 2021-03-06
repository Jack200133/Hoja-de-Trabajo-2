/** Test para probar que la calculadora recibe un string de datos y devuelve el resultado de la
 * operacion postfix*/
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraJACTest {

    @Test
    public void calculo() {
        CalculadoraJAC jc = new CalculadoraJAC();
        String st = jc.Calculo("1 2 3 / 4 * + 5 - 6 7 *+");
        assertEquals("38",st);

        st = jc.Calculo("5252*7**");
        assertEquals("Operacion No Valida",st);
    }
}