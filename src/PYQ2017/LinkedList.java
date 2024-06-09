package PYQ2017;

public class LinkedList {
    Node head;
    
    public boolean insertFirstLink(String brand, int sold) {
        if(head == null) {
            head = new Node(brand, sold);
            return true;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(brand, sold);
            return true;
        }
    }

    public boolean addAfter(String brand, String target, int sold) {
        if(head == null) {
            return false;
        } else {
            Node currentNode = head;
            int count = 1;
            while (currentNode != null && !currentNode.brand.equals(target)) {
                currentNode = currentNode.next;
                count++;
            }
            if(currentNode != null) {
                Node newNode = new Node(brand, sold);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                System.out.println("Adding " + brand + " after " + target);
                System.out.println("Found " + brand + " which is handbag number " + count + " in the linked list");
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean removeLink(String target) {
        if(head == null) {
            return false;
        } else {
            System.out.println("Removing " + target + "..");
            if(head.brand.equals(target)) {
                head = head.next;
                System.out.println("Found a match.. " + target + " is handbag number 1 in the linked list");
                return true;
            } else {
                Node currentNode = head;
                int count = 2;
                while (currentNode != null && !currentNode.next.brand.equals(target)) {
                    currentNode = currentNode.next;
                    count++;
                }
                if(currentNode != null) {
                    currentNode.next = currentNode.next.next;
                    System.out.println("Found a match.. " + target + " is handbag number " + count + " in the linked list");
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

    public void display() {
        System.out.println("\nDisplaying the Linked List ****************");
        Node currentNode = head;
        while (currentNode != null) {
            String numberFormatted = String.format("%,d", currentNode.sold);
            System.out.println(currentNode.brand + ": " + numberFormatted + " sold");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
