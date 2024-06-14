package PYQ2017U;

public class Q2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        int[] num = {10,20,30,40,50,60,70,80,90};

        for(Integer i : num) {
            queue.enqueue(i);
        }

        System.out.println("Original: " + queue.toString());

        System.out.println("And value of k = 4");
        queue.ChangeOrder(4);

        System.out.println("Final: " + queue.toString());
    }
}
