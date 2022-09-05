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
        maze[path.peek().y][path.peek().x] = 0;




    }
}
