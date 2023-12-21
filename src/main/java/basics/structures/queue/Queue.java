package basics.structures.queue;

public interface Queue<T> {

    public void enQueue(T element);

    public T deQueue();

    public T access(int position);

    public boolean contains(T element);

    public int getSize();
}
