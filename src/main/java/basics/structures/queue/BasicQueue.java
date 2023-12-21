package basics.structures.queue;

public class BasicQueue<T> implements Queue<T> {

    private T[] queue;
    private int front;
    private int back;

    public BasicQueue() {
        this.queue = (T[]) new Object[1000];
        this.front = -1;
        this.back = -1;
    }

    public BasicQueue(int size) {
        this.queue = (T[]) new Object[size];
        this.front = -1;
        this.back = -1;
    }

    @Override
    public void enQueue(T element) {
        if (getSize() == 0) {
            front++;
            back++;
            queue[back] = element;
        } else if (queue.length - 1 > back) {
            back++;
            queue[back] = element;
        } else {
            throw new IllegalArgumentException("This queue is full");
        }
    }

    @Override
    public T deQueue() {
        T element = null;
        if (getSize() == 0)
            throw new IllegalArgumentException("queue doesn't have any elements");
        else if (front == back) {
            element = queue[front];
            queue[front] = null;
            front = back = -1;
        } else {
            element = queue[front];
            queue[front] = null;
            front++;
        }
        return element;
    }

    @Override
    public T access(int position) {
        if (getSize() == 0 || position > getSize())
            throw new IllegalArgumentException("No items int the queue or position is greater than the queue size");

        int truePosition = 0;
        for (int i = front; i <= back; i++) {
            if (truePosition == position) {
                return queue[i];
            }
            truePosition++;
        }
        throw new IllegalArgumentException("No items at the specified position");
    }

    @Override
    public boolean contains(T element) {
        if (getSize() == 0)
            return false;

        boolean contain = false;
        for (int i = front; i <= back; i++)
            if (queue[i].equals(element)) {
                contain = true;
                break;
            }
        return contain;
    }

    @Override
    public int getSize() {
        if (front == -1 && back == -1)
            return 0;
        else
            return back - front + 1;
    }
}


