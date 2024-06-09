package PYQ2017;

public class Q1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirstLink("Louis Vuitton", 10000000);
        list.insertFirstLink("Chanel", 100000000);
        list.insertFirstLink("Prada", 1000000);
        list.insertFirstLink("Tods", 500000000);

        list.display();

        list.addAfter("Coach", "Chanel", 10000000);

        list.display();

        list.addAfter("Mulberry", "Coach", 90000000);

        list.display();

        list.removeLink("Chanel");

        list.display();

        list.removeLink("Coach");

        list.display();
    }
}
