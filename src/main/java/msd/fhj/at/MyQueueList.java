package msd.fhj.at;

public class MyQueueList<E> {
    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) { this.data = data; }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

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
