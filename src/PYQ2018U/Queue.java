package PYQ2018U;

import java.util.LinkedList;

public class Queue {
    LinkedList<String> queue = new LinkedList<>();
    int size;

    public Queue() {};

    public Queue(int i) {size = i;}

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public String peek() {
        if(queue.isEmpty()) return null;
        return queue.getFirst();
    }

    public void enqueue(String s) {
        if(queue.size() <= size) {
            System.out.println("Data "  + s + " inserted");
            queue.add(s);
        }
        else {
            System.out.println("The queue is full!");
        }
    }

    public String dequeue() {
        if(queue.isEmpty()) return null;
        System.out.println("Data "  + queue.peek() + " has been removed");
        return queue.removeFirst();
    }

    public void display() {
        System.out.println("-------------------------------------------");
        for(int i = 0; i < queue.size(); i++) {
            System.out.print("| " + i + " ");
        }
        System.out.print("|\n");
        System.out.println("-------------------------------------------");
        for(String s : queue) {
            System.out.print("| " + s + " ");
        }
        System.out.print("|\n");
        System.out.println("-------------------------------------------");
    }
}
