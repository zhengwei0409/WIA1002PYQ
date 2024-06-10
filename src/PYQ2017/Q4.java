package PYQ2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Character[] arr = {'a', 'b', 'c', 'd', 'e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        Queue<Character> queue = new Queue<>(arr);

        System.out.println("Queue: " + queue.toString());
        System.out.print("\nHow many times will you enter a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("(Please enter your number(s) between 0-26.)");
        ArrayList<Integer> enteredNumList = new ArrayList<>();

        for(int i = 1; i <= num; i++) {
            System.out.print("Enter number " + i + " >> ");
            int charNum = sc.nextInt();
            enteredNumList.add(charNum);
        }

        System.out.println("The entered numbers are " + enteredNumList.toString());

        System.out.print("The diciphered values are ");
        if(num <= 0) {
            System.out.print(" -Cannot decipher. No value was entered.- ");
        } else {
            for(int i : enteredNumList) {
                System.out.print(queue.getElement(i));
            }
        }

        System.out.println();
        sc.close();
    }
}
