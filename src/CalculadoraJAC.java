public class CalculadoraJAC implements CalculadoraGeneral{
    StackCalculadora<Integer> vec;

    public CalculadoraJAC() {
        vec = new StackCalculadora<Integer>();
    }

    /**
     * Metodo donde la calculadora llamara al stack para almacenar y hacer los calculos
     *
     */
    @Override
    public String calculo(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char inds = texto.charAt(i);

            if(Character.isDigit(inds)){
                vec.push(Character.getNumericValue(inds));

            }
            else {
                if (vec.size() > 1) {

                    int n1 = vec.pop();
                    int n2 = vec.pop();

                    switch (inds) {
                        case '+' -> {
                            vec.push(n1 + n2);
                        }
                        case '-' -> {
                            vec.push(n2 - n1);
                        }
                        case '*' -> {
                            vec.push(n1 * n2);
                        }
                        case '/' -> {
                            vec.push(n2 / n1);
                        }
                    }
                }
                else {
                    vec.pop();
                    return "Operacion No Valida";
                }
            }

        }
        return vec.pop().toString();
    }
}
