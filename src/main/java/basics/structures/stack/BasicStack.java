package basics.structures.stack;

public class BasicStack<T> implements Stack<T> {
    private T[] stack;
    private int pointer;

    public BasicStack() {
        this.stack = (T[]) new Object[1000];
        this.pointer = 0;
    }

    public void push(T element) {
        stack[pointer++] = element;
    }

    public T pop() {
        if (pointer != 0)
            return stack[--pointer];
        else
            throw new IllegalArgumentException("This stack has no elements");
    }

    public boolean contains(T element) {
        boolean contains = false;
        for (int i = 0; i < pointer; i++)
            if (stack[i].equals(element)) {
                contains = true;
                break;
            }
        return contains;
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public T access(T element) {
        while (pointer > 0) {
            T tempElement = pop();
            if (tempElement.equals(element))
                return tempElement;
        }
        throw new IllegalArgumentException("This stack doesn't have this element");
    }
}