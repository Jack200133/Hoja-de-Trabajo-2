/***************************************************************
 * StackVector.java
 * Autor: Juan Angel Carrera
 * Universidad del Valle de Guatemala
 *
 * Stack general que servira para almacenar los datos temporalmente
 * de la calculadora y usa un vector para implementar el stack
 ***************************************************************/
import java.util.Vector;

public class StackVector<T> implements Stack<T> {

    Vector<T> vector;

    public StackVector() {
        this.vector = new Vector<T>();
    }


    /**
     * Agrega un item al stack y sera eliminado en un pop si no se agrega otro item
     *
     */
    @Override
    public void push(T item) {
        vector.add(item);
    }

    /**
     * El stack no puede estar vacio y elimina el ultimo item y lo devuelove
     */
    @Override
    public T pop() {
        return vector.remove(size()-1);
    }

    /**
     * El stack no puede estar vacio y muestra el valor proximo a ser eliminado
     */
    @Override
    public T peek() {
        return vector.get(size()-1);
    }

    /**
     * Devuelve si el stack esta vacio o no
     */
    @Override
    public boolean empty() {
        return size() == 0;
    }

    /**
     * Devuelve el tamaño del stack
     */
    @Override
    public int size() {
        return vector.size();
    }
}
