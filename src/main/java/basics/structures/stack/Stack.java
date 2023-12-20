package basics.structures.stack;

public interface Stack<T> {
    public void push(T element);

    public T pop();

    public T access(T element);

    public boolean contains(T element);

    public boolean isEmpty();
}