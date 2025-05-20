package msd.fhj.at;

/*
 * A simple queue implementation using a linked list
 * The queue is implemented using a singly linked list
 * Each node contains data and a reference to the next node
 * The head of the queue is the first node in the linked list
 * The tail of the queue is the last node in the linked list
 * The size of the queue is maintained as a separate variable
 * The put method adds a new node to the end of the queue
 * The get method removes the first node from the queue and returns its data
 * The isEmpty method checks if the queue is empty
 */
public class MyQueueArray<E> {
    private Object[] elements;
    private int head = 0;
    private int tail = 0;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    /*  The head of the queue is the first node in the linked list
     * The tail of the queue is the last node in the linked list
     * The size of the queue is maintained as a separate variable
     * The put method adds a new node to the end of the queue
     * The get method removes the first node from the queue and returns its data
     * The isEmpty method checks if the queue is empty
     * The size of the queue is maintained as a separate variable */
    public MyQueueArray() {
        elements = new Object[INITIAL_CAPACITY];
    }

    // Constructor to initialize the queue with a default capacity
    public int size() {
        return size;
    }
    // Method to get the current size of the queue
    public boolean isEmpty() {
        return size == 0;
    }
    // Method to check if the queue is empty
    // Method to check if the queue is empty
    // Method to add an element to the queue
    // Method to remove and return the first element of the queue
    // If the queue is empty, return null
    public void put(E e) {
        if (size == elements.length) {
            resize();
        }
        elements[tail] = e;
        tail = (tail + 1) % elements.length;
        size++;
    }
    /*  Method to check if the queue is empty
     // Method to add an element to the queue
     // Method to remove and return the first element of the queue
      If the queue is empty, return null*/
    public E get() {
        if (isEmpty()) return null;
        E e = (E) elements[head];
        elements[head] = null; // avoid memory leak
        head = (head + 1) % elements.length;
        size--;
        return e;
    }
    /*
     * Method to return the first element of the queue without removing it
     * If the queue is empty, return null
     */
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
