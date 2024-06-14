package PYQ2018;

import java.util.ArrayList;

public class StackTest<E> {
    ArrayList<E> stack = new ArrayList<>();
    int size;

    public StackTest() {}

    public StackTest(int i) {size = i;} 

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public E peek() {
        return stack.getLast();
    }

    public boolean push(E e) {
        if(stack.size() <= size) {
            stack.add(e);
            System.out.println("Push item into stack: " + e);
            return true;
        } else {
            System.out.println("The stack is full!");
            return false;
        }
    }

    public E pop() {
        if(stack.isEmpty()) {
            return null;
        } 

        return stack.removeLast();
    }

    public void popAll() {
        while (!stack.isEmpty()) {
            System.out.println("Removing " + this.pop() + " ..");
        }
    }

    public void display() {
        System.out.println("Display Stack: ");
        System.out.println(stack.toString());
    }

    public void displayInReverse() {
        System.out.println("Display stack in reverse: ");
        if(!stack.isEmpty()) {
            for(int i = stack.size() - 1; i >= 0; i--) {
                System.out.println(stack.get(i));
            }
        } else {
            for(int i = 0; i < size; i++) {
                System.out.println("null");
            }
        }
        
    }
    
}
