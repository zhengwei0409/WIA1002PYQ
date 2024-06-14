package PYQ2017U;

import java.util.LinkedList;

public class Queue<Item> {
    LinkedList<Item> list = new LinkedList<>();

    public Queue() {};

    public Boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public Item peek() {
        return list.getFirst();
    }

    public void enqueue(Item e) {
        list.add(e);
    }

    public Item dequeue() {
        if(list.isEmpty()) return null;

        return list.removeFirst();
    }

    public String toString() {
        return list.toString();
    }

    public void ChangeOrder(int k) {
        for(int i = 1; i < k; i++) {
            list.add(list.removeFirst());
        }
    }
}
