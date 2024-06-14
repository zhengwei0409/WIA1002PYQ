package PYQ2018;

public class Q3 {
    public static void main(String[] args) {
        StackTest<String> s1 = new StackTest<>(4);
        s1.push("one");
        s1.push("two");
        s1.push("three");
        s1.push("four");
        System.out.println(s1.peek());
        s1.display();
        s1.displayInReverse();
        s1.popAll();
        s1.displayInReverse();
    }
}
