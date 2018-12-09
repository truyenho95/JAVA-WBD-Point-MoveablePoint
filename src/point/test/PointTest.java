package point.test;

import point.model.Point;

public class PointTest {
  public static void main(String[] args) {
    Point point1 = new Point();
    Point point2 = new Point(12,-5.5f);

    System.out.println(point1);
    System.out.println(point2);
  }
}
