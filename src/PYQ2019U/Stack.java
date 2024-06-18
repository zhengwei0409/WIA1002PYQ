package PYQ2019U;

class Stack<E> {

    E[] stack;
    int size;

    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<>(5);
        stack1.push("one");
        stack1.display();
        stack1.pushManny("two,three four,five,six seven");
        stack1.display();
        stack1.pop();
        stack1.pop();
        stack1.display();
        System.out.println("-----------------------");
        Stack<Integer> stack2 = new Stack<>(5);
        stack2.push(1);
        stack2.push(2);
        stack2.pushManny("3 4,5,6 7");
        stack2.display();
        stack2.popAll();
        stack2.display();
    }

    public Stack(int i) {
        stack = (E[]) new Object[i];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if(size == 0) return true;
        else return false;
    }

    public boolean isFull() {
        if(size == stack.length) return true;
        else return false;
    }

    public E peek() {
        return stack[0];
    }

    public void push(E e) {
        if(isFull()) System.out.println("The stack is full");
        else {
            for(int i = stack.length - 2; i >= 0; i--) {
                stack[i+1]  = stack[i];
            }
            stack[0] = e;
            System.out.println("Push: " + e);
            size++;
        }
    }

    public void pushManny(String str) {
        E[] a = (E[]) str.split(",");
        for(E i : a) {
            push(i);
        }
    }

    public E pop() {
        if(!isEmpty()) {
            E popItem = stack[0];
            for(int i = 1; i < stack.length; i++) {
                stack[i - 1] = stack[i];
                stack[i] = null;
            }
            size--;
            System.out.println("Removing " + popItem);
            return popItem;
        } else return null;
    }

    public void popAll() {
        System.out.println("\nThere are " + size + " in the stack. Removing all...");
        while (peek() != null) {
            pop();
        }
    }

    public void display() {
        if(!isEmpty()) {
            System.out.println("\nThere are " + size + " items in the stack. Displaying...");
            for(int i = 0; i < size; i++) {
                System.out.println(stack[i]);
            }
        } else {
            System.out.println("\nStack is empty, nothing to display...");
        }
        System.out.println();
    }
    
}