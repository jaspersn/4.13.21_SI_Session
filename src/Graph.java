import java.util.ArrayList;

public class Graph {

    private int x, y;
    private boolean[][] grid;

    public Graph(int x, int y, ArrayList<Point> points) {
        this.x = x + 1;
        this.y = y + 1;
        this.grid = new boolean[this.y][this.x]; // new boolean will init to false
        for (Point p : points) {
            grid[p.getY()][p.getX()] = true;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int y = grid.length - 1; y >= 0; y--) { // every y or grid[y]
            s += y + "\t|";
            for (int x = 0; x < grid[y].length; x++) {
                if (grid[y][x]) s += "\t.";
                else s += "\t ";
            }
            s += "\n";
        }
        s += "\t+";
        for (int i = 0; i < grid[0].length; i++) { // every x or grid[0][x]
            s += "----";
        }
        s += "\n\t";
        for (int i = 0; i < grid[0].length; i++) {
            s += "\t" + i;
        }
        return s;
    }
}
