package msd.fhj.at;
public class MyStackList<E> {
    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) { this.data = data; }
    }

    private Node<E> top = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(E e) {
        Node<E> node = new Node<>(e);
        node.next = top;
        top = node;
        size++;
    }

    public E pop() {
        if (isEmpty()) return null;
        E data = top.data;
        top = top.next;
        size--;
        return data;
    }
}