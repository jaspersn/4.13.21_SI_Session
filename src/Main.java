import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            points.add(new Point(r.nextInt(10), r.nextInt(10)));
        }
        System.out.println(points);
        Collections.sort(points);
        System.out.println(points);
        Graph g = new Graph(10, 10, points);

        System.out.println(g);
        ArrayList<Point> pList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            pList.add(new Point(r.nextInt(5), r.nextInt(8)));
        }
        Graph g2 = new Graph(4, 7, pList);
        System.out.println(g2);
    }
}
