/***************************************************************
 * Stack.java
 * Autor: Juan Angel Carrera
 * Universidad del Valle de Guatemala
 *
 * Stack general que servira para que sea implementada por cuaquier
 * clase que quiera hacer un stack para almacenar y usa generics
 * para que pueda recibir cualquier tipo de dato
 ***************************************************************/
public interface Stack<E>
{

    /** Agrega un item al stack y sera eliminado en un pop si no se agrega otro item*/
    public void push(E item);

    /** El stack no puede estar vacio y elimina el ultimo item y lo devuelove*/
    public E pop();

    /** El stack no puede estar vacio y muestra el valor proximo a ser eliminado*/
    public E peek();

    /** Devuelve si el stack esta vacio o no*/
    public boolean empty();

    /** Devuelve el tamaño del stack*/
    public int size();


}