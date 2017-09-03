package Chap8DynamicProgAndRecursion.Q2GridPath;

import java.util.ArrayList;
import java.util.HashSet;

public class Q2GridPathImproved {


    class Point {
        int row;
        int column;

        Point(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public int getColumn() {
            return column;
        }

        public void setColumn(int column) {
            this.column = column;
        }
    }

    ArrayList<Point> getGridPath(boolean[][] maze) {
        if (maze == null) {
            return null;
        }

        ArrayList<Point> path = new ArrayList<>();
        HashSet<Point> failedSet = new HashSet<>();
        if (getGridpath(maze, maze.length, maze[0].length, path, failedSet)) {
            return path;
        }

        return null;
    }


    private boolean getGridpath(boolean[][] maze,
                                int row,
                                int col, ArrayList<Point> path,
                                HashSet<Point> failedSet) {

        if (maze == null || col < 0 || row < 0) {
            return false;
        }

        boolean isFirst = (row == 0) && (col == 0);

        Point point = new Point(row, col);

        if (failedSet.contains(point)) {
            return false;
        }

        if (isFirst || getGridpath(maze, row, col - 1, path, failedSet)
                || getGridpath(maze, row - 1, col, path, failedSet)) {
            Point p = new Point(row, col);
            path.add(p);
            return true;
        }

        failedSet.add(point);
        return false;
    }
}
