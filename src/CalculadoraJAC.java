/***************************************************************
 * CalculadoraJAC.java
 * Autor: Juan Angel Carrera
 * Universidad del Valle de Guatemala
 *
 * Clase Calculadora que implementa el metodo de Calculo donde
 * se envian los numeros al Stack y cuando hay un signo opera
 * los numeros del stack en orde de arriba a abajo
 ***************************************************************/
public class CalculadoraJAC implements CalculadoraGeneral{
    StackVector<Integer> vec;

    public CalculadoraJAC() {
        vec = new StackVector<Integer>();
    }

    /**
     * Metodo donde la calculadora llamara al stack para almacenar y hacer los calculos
     *
     */
    @Override
    public String Calculo(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char inds = texto.charAt(i);

            if(Character.isWhitespace(inds)){ //no espacios en blanco

            }

            else if(Character.isDigit(inds)){
                vec.push(Character.getNumericValue(inds));
            }
            else {
                if (vec.size() > 1) {
                    try{
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
                    } catch (ArithmeticException e){
                        if(vec.size() > 1){
                            for (int j = 0; j <= vec.size(); j++) {
                                vec.pop();
                            }
                        }

                        return "No divisible entre 0";
                    }
                }
                else {
                    for (int j = 0; j <= vec.size(); j++) {
                        vec.pop();
                    }
                    return "Operacion No Valida";
                }
            }

        }
        if(vec.size() == 1){
            return vec.pop().toString();
        }
        else if (vec.size() > 0){
            for (int j = 0; j <= vec.size(); j++) {
                vec.pop();
            }
            return "Operacion No Valida";
        }
        return "Operacion no valida";
    }
}
