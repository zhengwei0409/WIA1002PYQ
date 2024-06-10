package PYQ2017;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();

        System.out.println("\nIs stack Empty? " + stack.isEmpty());

        System.out.println("\nPush 3 books to the pile: ");
        
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 3; i++) {
            System.out.print("Enter book title " + i + ":");
            stack.push(sc.nextLine());
        }
        sc.close();

        System.out.println("\nThe new books that you added are: " + stack.toString());

        System.out.println("\nIs stack Empty? " + stack.isEmpty());
        System.out.println("The pile has " + stack.size() + " books");

        System.out.println("\nGet the top book and remove the top book:");

        System.out.println("\nThe " + stack.peek() + " is at the top of the pile");
        System.out.println("The " + stack.pop() + " is removed from the pile");

        System.out.println("\nThe " + stack.peek() + " is at the top of the pile");
        System.out.println("The " + stack.pop() + " is removed from the pile");

        System.out.println("\nThe " + stack.peek() + " is at the top of the pile");
        System.out.println("The " + stack.pop() + " is removed from the pile");

        System.out.println("\nThe pile should be empty:"); 
        System.out.println("Is stack Empty? " + stack.isEmpty());
    }
    


}
