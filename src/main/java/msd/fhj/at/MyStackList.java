package msd.fhj.at;

public class MyStackList<E> {
    /*
     * A simple stack implementation using a linked list
     * The stack is implemented using a singly linked list
     * Each node contains data and a reference to the next node
     * The top of the stack is the head of the linked list
     * The size of the stack is maintained as a separate variable
     * The push method adds a new node to the top of the stack
     * The pop method removes the top node from the stack and returns its data
     * The isEmpty method checks if the stack is empty
     */
    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) { this.data = data; }
    }
    /*  The top of the stack is the head of the linked list
    // The size of the stack is maintained as a separate variable
    // The push method adds a new node to the top of the stack
    // The pop method removes the top node from the stack and returns its data
    // The isEmpty method checks if the stack is empty
    // The size of the stack is maintained as a separate variable */
    private Node<E> top = null;
    private int size = 0;


    // Constructor to initialize the stack with a default capacity
    public int size() {
        return size;
    }

    // Method to get the current size of the stack
    // Method to check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the stack is empty
    // Method to add an element to the stack
    // Method to remove and return the top element of the stack
    // If the stack is empty, return null
    public void push(E e) {
        Node<E> node = new Node<>(e);
        node.next = top;
        top = node;
        size++;
    }


    /*
     Method to return the top element of the stack without removing it
     If the stack is empty, return null
     Method to return the top element of the stack without removing it
     If the stack is empty, return null
     */
    
    public E pop() {
        if (isEmpty()) return null;
        E data = top.data;
        top = top.next;
        size--;
        return data;
    }
}