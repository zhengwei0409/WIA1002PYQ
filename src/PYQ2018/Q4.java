package PYQ2018;

public class Q4 {
    public static void main(String[] args) {
        LList list = new LList();

        list.add("Computing Mathematics 1", 3);
        list.add("Principles of AI", 3);
        list.add("Programming 1", 5);
        list.add("Data Structure", 5);
        System.out.println();
        list.display();
        list.addAfter("Programming 1", "Sofware Architecture", 4);
        list.addAfter("Sofware Architecture", "Networking", 4);
        System.out.println();
        list.display();

        list.remove("Networking");
        System.out.println();
        list.display();

        list.remove("Principles of AI");
        System.out.println();
        list.display();
        list.totalCreditHours();
    }
}
