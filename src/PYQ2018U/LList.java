package PYQ2018U;

public class LList {
    Node head;

    public LList() {};

    public boolean isEmpty() {
        if(head == null) {
            return true;
        } else return false;
    }

    public void add(String c, int hour) {
        if(head == null) {
            head = new Node(c, hour);
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(c, hour);
        }
    }

    public boolean addAfter(String target, String c, int hour) {
        if(head == null) {
            return false;
        } else {
            Node currentNode = head;
            while (currentNode != null && !currentNode.course.equals(target)) {
                currentNode = currentNode.next;
            }
            if(currentNode != null) {
                Node newNode = new Node(c, hour);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean remove(String target) {
        if(head == null) {
            return false;
        } else if(head.course.equals(target)) {
            head = head.next;
            return true;
        } 
        else {
            Node currentNode = head;
            while (currentNode.next != null && !currentNode.next.course.equals(target)) {
                currentNode = currentNode.next;
            }
            if(currentNode.next != null) {
                currentNode.next = currentNode.next.next;
                return true;
            } else {
                return false;
            }
        }
    }

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.course + ": " + currentNode.creditHours + " hours");
            currentNode = currentNode.next;
        }
    }

    public void totalCreditHours() {
        int total = 0;
        Node currentNode = head;
        while (currentNode != null) {
            total += currentNode.creditHours;
            currentNode = currentNode.next;
        }
        System.out.println("Total credit hours taken: " + total);
    }
}
