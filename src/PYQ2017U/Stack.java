package PYQ2017U;

import java.util.ArrayList;

public class Stack {
    ArrayList<Character> stack = new ArrayList<>();

    public boolean push(char c) {
        if(!this.isStackFull()) {
            stack.add(c);
            return true;
        } else {
            return false;
        }
    }

    public Character pop() {
        if(stack.isEmpty()) return null;

        return stack.removeLast();
    }

    public Character peek() {
        return stack.getLast();
    }

    public boolean isStackEmpty() {
        return stack.isEmpty();
    }

    public boolean isStackFull() {
        if(stack.size() > 10) {
            return true;
        } else {
            return false;
        }
    }
}
