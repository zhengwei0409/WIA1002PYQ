package PYQ2019;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

public class Q3 {
    static String[][] maze = new String[5][5];
    public static void main(String[] args) {
        
        // implement your own stack oh ><
        Stack<Position> path = new Stack<>();

        try {
            Scanner sc = new Scanner(new FileInputStream("WIA1002PYQ/src/PYQ2019/maze.txt"));

            for(int i = 0; i < 5; i++) {
                maze[i] = sc.nextLine().split(" "); 
            }

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }

        for(String[] i : maze) {
            for(String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        Position starting = new Position(0, 0);
        path.push(starting);

        

        while (true) {
            int x = path.peek().x;
            int y = path.peek().y;

            maze[y][x] = "0";

            // down 
            if(isValid(y+1, x)) {
                if(maze[y+1][x].equals("C")) {
                    path.push(new Position(y+1, x)); 
                    System.out.println("You won!");
                    break;
                } else if(maze[y+1][x].equals("1")) {
                    path.push(new Position(y+1, x)); 
                    continue;
                }
            }
            
            // right
            if(isValid(y, x+1)) {
                if(maze[y][x+1].equals("C")) {
                    path.push(new Position(y, x+1)); 
                    System.out.println("You won!");
                    break;
                } else if(maze[y][x+1].equals("1")) {
                    path.push(new Position(y, x+1)); 
                    continue;
                }
            }

            // up 
            if(isValid(y-1, x)) {
                if(maze[y-1][x].equals("C")) {
                    path.push(new Position(y-1, x)); 
                    System.out.println("You won!");
                    break;
                } else if(maze[y-1][x].equals("1")) {
                    path.push(new Position(y-1, x)); 
                    continue;
                }
            }

            // left
            if(isValid(y, x-1)) {
                if(maze[y][x-1].equals("C")) {
                    path.push(new Position(y, x-1)); 
                    System.out.println("You won!");
                    break;
                } else if(maze[y][x-1].equals("1")) {
                    path.push(new Position(y, x-1)); 
                    continue;
                }
            }
            
            path.pop();
            if(path.size()<= 0) {
                System.out.println("Oh no!!! Harry couldn't find the Triwizard Cup!\nSomeone quickly gets Professor Dumbledore");
                break;
            }

        }

        int length = path.size();
        int cnt = 0;
        if(length != 0) {
            for(Position i : path) {
                if(cnt == length - 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " > ");
                }
                cnt++;
            }
        }
        

    }

    // to check whether is out of bound
    public static boolean isValid(int y, int x) {
        if(y < 0 || y >= maze.length || x < 0 || x >= maze[y].length) {
            return false;
        } else {
            return true;
        }
    }
}
