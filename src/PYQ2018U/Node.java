package PYQ2018U;

public class Node {
    String course;
    int creditHours;
    Node next;

    public Node(String c, int ch) {
        this.course = c;
        this.creditHours = ch;
    }
}
