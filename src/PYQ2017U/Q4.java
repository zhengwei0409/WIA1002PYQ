package PYQ2017U;

public class Q4 {
    public static void main(String[] args) {
        SinglyLinkedListFinals s1 = new SinglyLinkedListFinals();

        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        s1.addAfter(11, 10);
        s1.addAfter(21, 20);
        s1.addAfter(31, 30);
        s1.addAfter(41, 40);
        s1.addAfter(51, 50);
        s1.traverse();
        s1.deleteFront();
        s1.deleteFront();
        s1.traverse();
        s1.deleteAfter(40);
        s1.deleteAfter(40);
        s1.deleteAfter(31);
        s1.deleteAfter(40);
        s1.traverse();
    }
}
