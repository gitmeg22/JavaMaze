package com.javamaze;

import java.util.LinkedList;


public class MazeRunner {
    /* Store maze in program using static;
    * Static makes it accessible to the main method;
    * If maze was not static,
    * would need instance of maze in main */
    static int [][] maze = {
            {2, 0, 1, 1},
            {1, 1, 0, 1},
            {0, 1, 1, 1}
    };

    // 0 = wall
    // 1 = path
    // 2 = destination

    // Create stack FILO to track path
    static LinkedList<Position> path = new LinkedList<Position>();

    public static void main(String[] args) {

        Position start = new Position(3, 0);
        // Use push (beginning of list) vs add (end of list)
        path.push(start);

        // If a path is bad; set Position to zero

        // Look at most recent Position in maze
        // .peek = look, but do not remove
        // NEED TO LOOK AT Y FIRST... ROW OF 2D ARRAY
        // THEN X... COLUMN
        assert path.peek() != null;
        int y = path.peek().y;
        int x = path.peek().x;

        // Mark path start as zero
        maze[y][x] = 0;

        // Check path going DOWN with ENHANCED SWITCH STATEMENT
      /*  switch (maze[y + 1][x]) {
            case 2 -> System.out.println("You WIN!");
            case 1 -> System.out.println("keep going");
            case 0 -> System.out.println("blocked");
            default -> System.out.println("NOTHING FOUND");
        }*/

//        while (true) {
            if (maze[y + 1][x] == 2) {
                System.out.println("You WIN!");
                return;
            } else if (maze[y + 1][x] == 1) {
                System.out.println("Moved down");
                path.push(new Position(x, y + 1));
            }
//        }


    }
}
