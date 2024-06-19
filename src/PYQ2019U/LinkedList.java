package PYQ2019U;

public class LinkedList {
    Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("Computing Mathematics", 3);
        list.add("Network Architecture", 3);
        list.add("Final Year Project", 5);
        list.add("Data Structure", 5);
        list.display();
        list.totalCreditHours();
        list.addAfter("Final Year Project", "Software Modelling", 4);
        list.addAfter("Software Modelling", "Intelligent Robot", 3);
        list.addAfter("Computing Mathematics", "Gamification", 4);
        list.totalCreditHours();
        list.remove("Network Architecture", 3);
        list.remove("Software Modelling", 4);
        list.display();
        list.totalCreditHours();
    }

    public LinkedList() {}

    public boolean isEmpty() {
        if(head == null) return true;
        else return false;
    }

    public void add(String subject, int hours) {
        if(isEmpty()) {
            head = new Node(subject, hours);
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(subject, hours);
        }
    }

    public boolean addAfter(String target, String subject, int hours) {
        if(isEmpty()) {
            return false;
        } else {
            Node currentNode = head;
            while (currentNode.next != null && !currentNode.subject.equals(target)) {
                currentNode = currentNode.next;
            }
            if(currentNode.next != null) {
                Node newNode = new Node(subject, hours);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                System.out.println("\nAdding " + subject + " after " + target);
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean remove(String subject, int hours) {
        System.out.println("\nRemoving " + subject + "...");
        if(isEmpty()) {
            System.out.println("The list is empty, cannot remove!!!");
            return false;
        } else if(head.subject.equals(subject)) {
            head = head.next;
            return true;
        }
        else {
            Node currentNode = head;
            while(currentNode.next != null && !currentNode.next.subject.equals(subject)) {
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
        System.out.println("\nDisplaying the Linked List ----------------\n");
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.subject + ": " + currentNode.hours + " hours");
            currentNode = currentNode.next;
        }
    }

    public void totalCreditHours() {
        int cnt = 0;
        Node currentNode = head;
        while (currentNode != null) {
            cnt += currentNode.hours;
            currentNode = currentNode.next;
        }
        System.out.println("\nTotal credit hours: " + cnt);
        
    }
}

class Node {
    String subject;
    int hours;
    Node next;

    public Node(String subject, int hours) {
        this.subject = subject;
        this.hours = hours;
    }
}
