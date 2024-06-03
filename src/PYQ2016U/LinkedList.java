package PYQ2016U;

public class LinkedList<E> {
    Node<E> head;

    public boolean add(E e) {
        if(head == null) {
            head = new Node<>(e);
            System.out.println("Adding: " + e);
            return true;
        } else {
            Node<E> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node<>(e);
            System.out.println("Adding: " + e);
            return true;
        }
    }

    public boolean addAfter(E e, E index) {
        if(head == null) {
            return false;
        } else {
            Node<E> currentNode = head;
            while (currentNode != null && !currentNode.element.equals(index)) {
                currentNode = currentNode.next;
            }
            if(currentNode != null) {
                Node<E> newNode = new Node<>(e);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                System.out.println("Adding " + e + " after " + index);
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean deleteFront() {
        if(head == null) {
            return false;
        } else {
            System.out.println("Deleting front: " + head.element);
            head = head.next;
            return true;
        }
    }

    public boolean deleteAfter(E index) {
        if(head == null) {
            return false;
        } else {
            System.out.println("Testing deleteAfter: ");
            Node<E> currentNode = head;
            while (currentNode != null && !currentNode.element.equals(index)) {
                currentNode = currentNode.next;
            }
            if(currentNode != null && currentNode.next != null) {
                if(currentNode.next.next != null) {
                    System.out.println("After " + index + " is " + currentNode.next.element + ". Deleting " + currentNode.next.element);
                    currentNode.next = currentNode.next.next;
                    return true;
                } else {
                    System.out.println("After " + index + " is " + currentNode.next.element + ". Deleting " + currentNode.next.element);
                    currentNode.next = null;
                    return true;
                }
            } else {
                System.out.println("Element (" + index + ") not found...");
                return false;
            }
        }
    }

    public void traverse() {
        Node<E> currentNode = head;
        System.out.println("Showing content of my linked list: ");
        while (currentNode != null) {
            System.out.print(currentNode.element + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }


}
