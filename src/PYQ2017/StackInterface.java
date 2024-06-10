package PYQ2017;


public interface StackInterface<E> {
    
    // return the number of elements in this stack
    int size();

    // returns the top element in this stack
    E peek();

    // returns and removes the top element in this stack
    E pop();

    // adds a new element to the top of this stack
    void push(E e);
    
    // returns true if the stack is empty
    boolean isEmpty();
}
