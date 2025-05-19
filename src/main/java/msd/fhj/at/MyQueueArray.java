package msd.fhj.at;
public class MyQueueArray<E> {
    private Object[] elements;
    private int head = 0;
    private int tail = 0;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    public MyQueueArray() {
        elements = new Object[INITIAL_CAPACITY];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(E e) {
        if (size == elements.length) {
            resize();
        }
        elements[tail] = e;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public E get() {
        if (isEmpty()) return null;
        E e = (E) elements[head];
        elements[head] = null; // avoid memory leak
        head = (head + 1) % elements.length;
        size--;
        return e;
    }

    private void resize() {
        Object[] newArray = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[(head + i) % elements.length];
        }
        elements = newArray;
        head = 0;
        tail = size;
    }
}
