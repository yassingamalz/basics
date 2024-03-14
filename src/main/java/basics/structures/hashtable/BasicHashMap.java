package basics.structures.hashtable;


import java.util.Objects;

public class BasicHashMap<T> implements HashMap<T> {
    private Object[] hashMap;

    public BasicHashMap() {
        hashMap = new Object[10000000];
    }


    @Override
    public void put(int key, T value) {
        hashMap[key] = (Object[]) value;
    }

    @Override
    public T get(int key) {
        if (Objects.nonNull(hashMap[key]))
            return (T) hashMap[key];
        return null;
    }

    @Override
    public void remove(int key) {
        if (Objects.nonNull(hashMap[key]))
            hashMap[key] = null;
    }
}

