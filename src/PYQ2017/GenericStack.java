package PYQ2017;

import java.util.ArrayList;

public class GenericStack<E> implements StackInterface<E> {

    private ArrayList<E> list;

    public GenericStack() {
        list = new ArrayList<>();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E peek() {
        if(list.isEmpty()) return null;
        else return list.getLast();
    }

    @Override
    public E pop() {
        if(list.isEmpty()) return null;
        else return list.removeLast();
    }

    @Override
    public void push(E e) {
        list.add(e);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override 
    public String toString() {
        return list.toString();
    }
    
}
