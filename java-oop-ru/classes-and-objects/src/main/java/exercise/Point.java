package exercise;

import lombok.Getter;

// BEGIN
@Getter
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
// END

class Out {
    public static void main(String[] args) {
        Point point1 = new Point(4, 3);
        Point point2 = new Point(6, 1);
        Segment segment = new Segment(point1, point2);
        Point midPoint = segment.getMidPoint();
        System.out.println(midPoint.getX()); // 4
        System.out.println(midPoint.getY()); // 3
    }
}
