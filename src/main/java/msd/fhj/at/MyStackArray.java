package msd.fhj.at;
public class MyStackArray<E> {
    private Object[] elements;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    public MyStackArray() {
        elements = new Object[INITIAL_CAPACITY];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(E e) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = e;
    }

    public E pop() {
        if (isEmpty()) return null;
        E e = (E) elements[--size];
        elements[size] = null; // avoid memory leak
        return e;
    }

    private void resize() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }
}
