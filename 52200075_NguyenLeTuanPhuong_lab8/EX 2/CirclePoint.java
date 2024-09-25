import java.util.ArrayList;

public class CirclePoint {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(0.2, 0.6));
        points.add(new Point(0.3, 0.3));
        points.add(new Point(0.9, 0.7));
        points.add(new Point(0.7, 0.6));
        points.add(new Point(0.2, 0.4));
        points.add(new Point(0.2, 0.9));

        ArrayList<Point> circle = new ArrayList<Point>();
        for(Point p : points) {
            if(p.distance() < 1.0) {
                circle.add(p);
            }
        }
        
        System.out.println("Points in the circle:");
        for(Point gke : circle) {
            System.out.println(gke);
        }
    } 
}