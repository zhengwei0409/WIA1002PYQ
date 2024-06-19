package PYQ2019U;

public class Queue<E> {
    E[] queue;
    int size;

    public static void main(String[] args) {
        Queue<String> q = new Queue<>(6);
        q.enqueue("Hello");
        q.enqueueManny("all,who,wants,ice cream,or cookies");
        q.display();
        q.dequeue();
        q.dequeueAll();
        q.display();
        System.out.println("------------------------------");
        Queue<Integer> q2 = new Queue<>(6);
        q2.enqueue(1000);
        q2.enqueue(2000);
        q2.enqueueManny("3000,4000 5000,6000,7000,8000,9000");
        q2.display();
        q2.dequeue();
        q2.dequeue();
        q2.enqueue(8000);
        q2.dequeueAll();
        q2.display();
    }

    public Queue(int capacity) {
        queue = (E[]) new Object[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        if(size == 0) return true;
        else return false;
    }

    public boolean isFull() {
        if(size == queue.length) return true;
        else return false;
    }

    public E peek() {
        if(size==0) {
            return null;
        }
        return queue[size-1];
    }

    public void enqueue(E e) {
        if(!isFull()) {
            queue[size] = e;
            size++;
            System.out.println("Enqueue: " + e);
        } else {
            System.out.println("The queue is FULL!");
        }
    }

    public void enqueueManny(String e) {
        E[] temp = (E[]) e.split(",");
        for(E i : temp) {
            enqueue(i);
        }
    }

    public E dequeue() {
        if(!isEmpty()) {
            E temp = queue[0];
            for(int i = 0; i < size - 1; i++) {
                queue[i] = queue[i+1];
            }
            queue[size - 1] = null;
            size--;
            System.out.println("Dequeue: " + temp);
            return temp; 
        } else {
            return null;
        }
    }

    public void dequeueAll() {
        System.out.println("\nThere are " + size + " items in the queue. Removing them all...");
        while (!isEmpty()) {
            dequeue();
        }
    }

    public void display() {
        if(isEmpty()) System.out.println("\nNothing to display");
        else {
            System.out.println("\nThere are " + size + " items in the queue. Displaying...");
            for(int i = 0; i < size; i++) {
                System.out.println(queue[i]);
            }
        }
        
        System.out.println();
    }
}
