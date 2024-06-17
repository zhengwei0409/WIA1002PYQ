package PYQ2019;

public class MyLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(E e) {
        if(head == null) {
            head = new Node<E>(e);
            tail = head;
            size++;
        } else {
            Node<E> temp = head;
            head = new Node<E>(e);
            head.next = temp;
            size++;
        }
    }

    public void addLast(E e) {
        if(head == null) {
            head = new Node<E>(e);
            tail = head;
            size++;
        } else {
            tail.next = new Node<E>(e);
            tail = tail.next;
            size++;
        }
    }

    public E removeFirst() {
        if(head == null) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            size--;
            return temp.element;
        }
    }

    @Override
    public String toString() {
        String s = String.format("[size=%d]", size);
        Node<E> currentNode = head;
        while (currentNode!=null) {
            s += " >> " + currentNode.element;
            currentNode = currentNode.next;
        }
        return s;
    }



    



}
