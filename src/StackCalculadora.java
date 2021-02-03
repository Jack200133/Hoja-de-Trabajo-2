import java.util.Vector;

public class StackCalculadora<T> implements Stack<T> {

    Vector<T> vector;

    public StackCalculadora() {
        this.vector = new Vector<T>();
    }

    @Override
    public void push(T item) {
        vector.add(item);
    }

    @Override
    public T pop() {
        return vector.remove(size()-1);
    }

    @Override
    public T peek() {
        return vector.get(size()-1);
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return vector.size();
    }
}
