package PYQ2016U;

import java.util.LinkedList;

public class Queue<Item> {
    LinkedList<Item> list = new LinkedList<>();

    public Queue() {}

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public Item peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue underflow");
        }
        return list.getFirst();
    }

    public void enqueue(Item e) {
        list.add(e);
    }

    public Item dequeue() {
        if(isEmpty()) {
            throw new RuntimeException("Queue underflow");
        }
        return list.removeFirst();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public void ChangeOrder(int k) {
        for(int i = 1; i < k; i++) {
            list.add(list.removeFirst());
        }

        System.out.println(this.toString());
    }
}
