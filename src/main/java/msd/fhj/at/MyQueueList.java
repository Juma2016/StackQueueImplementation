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
public class MyQueueList<E> {
    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) { this.data = data; }
    }

    /*  The head of the queue is the first node in the linked list
     * The tail of the queue is the last node in the linked list
     * The size of the queue is maintained as a separate variable
     * The put method adds a new node to the end of the queue
     * The get method removes the first node from the queue and returns its data
     * The isEmpty method checks if the queue is empty
     * The size of the queue is maintained as a separate variable */
    private Node<E> head = null;
    // The tail of the queue is the last node in the linked list
    private Node<E> tail = null;
    // The head of the queue is the first node in the linked list
    private int size = 0;

    // Constructor to initialize the queue with a default capacity
    public int size() {
        return size;
    }


    // Method to get the current size of the queue
    // Method to check if the queue is empty
    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }


    /*  Method to check if the queue is empty
    // Method to add an element to the queue
    // Method to remove and return the first element of the queue
     If the queue is empty, return null*/
    public void put(E e) {
        Node<E> node = new Node<>(e);
        if (tail != null) {
            tail.next = node;
        } else {
            head = node;
        }
        tail = node;
        size++;
    }


    /*
     * Method to return the first element of the queue without removing it
     * If the queue is empty, return null
     * Method to return the first element of the queue without removing it
     * If the queue is empty, return null
     */
    public E get() {
        if (isEmpty()) return null;
        E data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }
}
