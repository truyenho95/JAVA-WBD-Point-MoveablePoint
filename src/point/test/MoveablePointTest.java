package point.test;

import point.model.MoveablePoint;

public class MoveablePointTest {
  public static void main(String[] args) {
    MoveablePoint moveablePoint1 = new MoveablePoint();
    MoveablePoint moveablePoint2 = new MoveablePoint(2.3f,-3.2f);
    MoveablePoint moveablePoint3 = new MoveablePoint(-2, 10, 6, -5f);

    System.out.println(moveablePoint1);
    System.out.println(moveablePoint2);
    System.out.println(moveablePoint3);

    System.out.println(moveablePoint2.move());
  }
}
