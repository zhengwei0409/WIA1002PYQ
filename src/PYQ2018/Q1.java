package PYQ2018;

public class Q1 {
    public static void main(String[] args) {
        towerOfHanoi(5, "A", "B", "C");
    }

    public static void towerOfHanoi(int n, String start, String helper, String destination) {
        if(n > 0) {
            towerOfHanoi(n - 1, start, destination, helper);
            System.out.println(start + " - > " + destination);
            towerOfHanoi(n - 1, helper, start, destination);
        }
    } 
}
