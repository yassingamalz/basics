package basics.structures.hashtable;

public class BasicHashSet<T> implements HashSet<T> {
    private T[] hashSet;
    private int position;

    public BasicHashSet() {
        hashSet = (T[]) new Object[10000000];
        position = 0;
    }

    @Override
    public void add(T key) {
        for (int i = 0; i < position; i++) {
            if (hashSet[i] == key)
                break;
        }
        hashSet[position++] = key;
    }

    @Override
    public void remove(T key) {
        for (int i = 0; i < position; i++)
            if (hashSet[i] == key) {
                hashSet[i] = null;
                return;
            }
    }

    @Override
    public boolean contains(T key) {
        for (int i = 0; i < position; i++) {
            if (hashSet[i] == key)
                return true;
        }
        return false;
    }
}

