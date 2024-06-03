package PYQ2016U;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new FileInputStream("src/PYQ2016U/BracMatch.txt"));
            
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                if(!str.contains("[") && !str.contains("{") && !str.contains("(") && !str.contains("<")) {
                    System.out.println("There is no bracket in the input");
                    continue;
                }

                if(checkMatch(str)) System.out.println("YES - all matched!");
                else System.out.println("Not all brackets are mathced");
                
            }

            sc.close();
            
        } catch (Exception e) {
            System.out.println("Error ><");
        }
    }

    public static boolean checkMatch(String str) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(currentChar == '[' || currentChar == '{' || currentChar == '(' || currentChar == '<') {
                stack.push(currentChar);
            } else if (currentChar == ']' || currentChar == '}' || currentChar == ')' || currentChar == '>') {
                if(stack.isEmpty()) return false;

                char matchedChar = stack.pop();
                if ((currentChar == ']' && matchedChar != '[') ||
                    (currentChar == '}' && matchedChar != '{') ||
                    (currentChar == ')' && matchedChar != '(') ||
                    (currentChar == '>' && matchedChar != '<')) {
                    return false; 
                }
            }
        }
        return stack.isEmpty();
    } 
}