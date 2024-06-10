package PYQ2017;

import java.util.Stack;

public class BST<E extends Comparable<E>> {
    BSTNode<E> root;
    int size;
    

    // recursive function
    public boolean add(BSTNode<E> node, E item) {
        if(root == null) {
            root = new BSTNode<>(item);
            size++;
            return true;
        } else {
            if (item.compareTo(node.element) < 0) {
                if(node.left == null) {
                    node.left = new BSTNode<>(item);
                    size++;
                    return true;
                } else {
                    return add(node.left, item);
                }
            } else if(item.compareTo(node.element) > 0) {
                if(node.right == null) {
                    node.right = new BSTNode<>(item);
                    size++;
                    return true;
                } else {
                    return add(node.right, item);
                }
            } else {
                // replicate item
                return false;
            }
        }
    }

    // non-recursive
    public void printTreeInOrder() {
        Stack<BSTNode<E>> stack = new Stack<>();
        BSTNode<E> current = root;
        while (current != null || !stack.isEmpty()) {
            if(current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.println(current.element);

            current = current.right;
        }
    }

    public boolean contains(E item) {
        BSTNode<E> current = root;

        while (current != null) {
            if(item.compareTo(current.element) > 0) {
                current = current.right;
            } else if (item.compareTo(current.element) < 0) {
                current = current.left;
            } else {
                return true;
            }
        }

        return false;
    }

}
