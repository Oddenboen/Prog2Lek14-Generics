package queue;

import java.util.NoSuchElementException;

public class Queue<T> {

    private Node head;
    private Node tail;
    private int count = 0;

    public void enqueue(T element) {
        Node newNode = new Node();
        newNode.data = element;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public T dequeue() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node oldHead = head;
        head = head.next;

        count--;
        return oldHead.data;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    private class Node {
        public T data;
        public Node next;
    }
}
