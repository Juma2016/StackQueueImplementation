package msd.fhj.at;
public class MyStackArray<E> {
    private Object[] elements; // Array to store stack elements
    private int size = 0; // Current size of the stack
    private static final int INITIAL_CAPACITY = 10;// Initial capacity of the stack



    // Constructor to initialize the stack with a default capacity
    public MyStackArray() {
        elements = new Object[INITIAL_CAPACITY]; // Initialize the stack with the default capacity
    }

    // Constructor to initialize the stack with a specified capacity

    public int size() {
        return size;
    }
    // Method to get the current size of the stack
    public boolean isEmpty() {
        return size == 0;
    }
    // Method to check if the stack is empty
    public void push(E e) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = e;
    }
    /*Method to add an element to the stack
     Method to remove and return the top element of the stack
     If the stack is empty, return null*/
    public E pop() {
        if (isEmpty()) return null;
        E e = (E) elements[--size];
        elements[size] = null; // avoid memory leak
        return e;
    }
    /*
     * Method to return the top element of the stack without removing it
     * If the stack is empty, return null
     */
    private void resize() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }
}
