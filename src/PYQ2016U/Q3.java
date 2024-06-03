package PYQ2016U;

public class Q3 {
    public static void main(String[] args) {
        Queue<Integer> queueee = new Queue<>();
        int[] arr = {10,20,30,40,50,60,70,80,90};

        for(int i : arr) {
            queueee.enqueue(i);
        }

        queueee.ChangeOrder(4);
    }

}
