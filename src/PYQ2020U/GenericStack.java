package PYQ2020U;

public class GenericStack<E> {
    E[] stack;
    int size;

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>(7);
        stack1.push("apple");
        stack1.display();
        stack1.pushMany("broccoli,chicken sandwich,donut,french fries,juice,maruku");
        stack1.display();
        System.out.println("Pop the top of the stack: " + stack1.pop());
        System.out.println("Pop the top of the stack: " + stack1.pop());
        stack1.display();
        System.out.println("Pop middle of the stack: " + stack1.popMiddle());

        stack1.display();
        System.out.println("Pop middle of the stack: " + stack1.popMiddle());
        stack1.display();
        System.out.println("------------------------");
        GenericStack<Integer> stack2 = new GenericStack<>(10);
        stack2.push(1);
        stack2.push(2);
        stack2.pushMany("3 4,5,6 7");
        stack2.display();
        stack2.popAll();
        stack2.display();

    }

    public GenericStack(int capacity) {
        stack = (E[]) new Object[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        } else{
            return false;
        }
    }

    public boolean isFull() {
        if(size == stack.length) {
            return true;
        } else {
            return false;
        }
    }

    public E peek() {
        return stack[size-1];
    }

    public void push(E e) {
        if(isFull()) {
            System.out.println("The stack is full!! ");
        } else {
            stack[size] = e;
            size++;
            System.out.println("Push: " + e);
        }
    }

    public boolean pushMany(String str) {
        if(isFull()) {
            return false;
        } else {
            System.out.println("Push many into stack...");
            E[] temp = (E[]) str.split(",");
            for(E e : temp) {
                push(e);
            }
            return true;
        }
    }

    public E pop() {
        if(isEmpty()) {
            return null;
        } else {
            E temp = stack[size-1];
            stack[size-1] = null;
            size--;
            return temp;
        }
    }

    public E popMiddle() {
        if(isEmpty()) {
            return null;
        } else if (size % 2 != 0) {
            E temp = stack[size/2];
            for(int i = size/2; i < size - 1; i++) {
                stack[i] = stack[i+1];
            }
            size--;
            return temp;

        } else {
            System.out.println("Current count of stack is even number, so no middle index..");
            return null;
        }
    }

    public boolean popAll() {
        if(isEmpty()) {
            return false;
        } else {
            System.out.println("There are " + size + " items in the stack. Pop all...");
            while (!isEmpty()) {
                System.out.println("Removing " + stack[size-1] + "..");
                stack[size-1] = null;
                size--;
            }
            return true;
        }
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("\nStack is empty, nothing to display..");
        } else {
            System.out.println("\nThere are " + size + " items in the stack. Displaying...");
            for(int i = size - 1; i >= 0; i--) {
                System.out.println(stack[i]);
            }
            System.out.println();
        }
        
    }
}
