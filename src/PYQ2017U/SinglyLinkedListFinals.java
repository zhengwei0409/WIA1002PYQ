package PYQ2017U;

public class SinglyLinkedListFinals {
    Node head;

    public void add(int e) {
        System.out.println("Adding: " + e);
        if(head == null) {
            head = new Node(e);
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(e);
        }
    }

    public boolean addAfter(int e, int index) {
        if(head == null) {
            return false;
        } else {
            Node currentNode = head;
            while (currentNode != null && currentNode.element != index) {
                currentNode = currentNode.next;
            }
            if(currentNode != null) {
                Node newNode = new Node(e);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                System.out.println("Adding " + e + " after "  + index);
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean deleteFront() {
        if(head == null) return false;
        else {
            System.out.println("\nDeleting front: " + head.element);
            head = head.next;
            return true;
        }
    }

    public boolean deleteAfter(int index) {
        System.out.println("\nTesting deleteAfter: ");
        if(head == null) {
            System.out.println("Element " + index + " not found...");
            return false;
        }
        else {
            Node currentNode = head;
            while (currentNode != null && currentNode.element != index) {
                currentNode = currentNode.next;
            }
            if(currentNode != null && currentNode.next != null) {
                System.out.println("After " + index + " is " + currentNode.next.element + ". Deleting " + currentNode.next.element);
                currentNode.next = currentNode.next.next;
                return true;
            } else {
                System.out.println("Element " + index + " not found...");
                return false;
            } 
        }
    }

    public void traverse() {
        Node currentNode = head;
        System.out.println("\nShowing content of my linked list: ");
        while (currentNode != null) {
            System.out.print(currentNode.element + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }


}
