package PYQ2017U;

public class Q3 {
    public static void main(String[] args) {
        Stack stack = new Stack();

        char[] c = {'M','A','L','A','Y','S','I','A'};

        for(Character i : c ) {
            stack.push(i);
        }

        while (!stack.isStackEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
