public class Point implements Comparable<Point>{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point o) {
        if (x != o.x) return x - o.x;
        return y - o.y;
    }
}
