package Chap8DynamicProgAndRecursion.Q2GridPath;

import java.util.ArrayList;

public class Q2GriddPath {

    class Point{
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
    
    ArrayList<Point> getGridPath(boolean[][] maze){
        if(maze == null || maze.length == 0){
            return null;
        }
        ArrayList<Point> path = new ArrayList<>();

        if(getGridPath(maze, maze.length, maze[0].length, path)){
            return path;
        }
        return null;
    }

    private boolean getGridPath(boolean[][] maze, int row, int col, ArrayList<Point> path) {
        if(maze == null || row <0 || col < 0){
            return false;
        }

        boolean isFirstPoint = row ==0 && col ==0;

        if(isFirstPoint || getGridPath(maze, row, col-1, path)
                        || getGridPath(maze, row-1, col, path)){
            Point point = new Point(row,col);
            path.add(point);
            return true;
        }

        return false;
    }
}
