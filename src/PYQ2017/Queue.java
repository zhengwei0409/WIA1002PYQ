package PYQ2017;

import java.util.LinkedList;

public class Queue<E> {
    LinkedList<E> queue;

    public Queue(E[] items) {
        queue = new LinkedList<>();
        for(E e : items) {
            queue.add(e);
        }
    }

    public Queue() {
        queue = new LinkedList<>();
    }

    public void enqueue(E e) {
        queue.add(e);
    }

    public E dequeue() {
        if(queue.isEmpty()) {
            return null;
        } else {
            return queue.removeFirst();
        }
    }

    public E getElement(int i) {
        return queue.get(i);
    }

    public int getSize() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public String toString() {
        return queue.toString();
    }

}
