package point.model;

public class Point {
  private float x;
  private float y;

  public Point() {
    this.x = 0.0f;
    this.y = 0.0f;
  }

  public Point(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public void setXY(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float[] getXY() {
    float[] XYArray = {this.x, this.y};
    return XYArray;
  }

  @Override
  public String toString() {
    return String.format("(%.3f,%.3f)", this.x, this.y);
  }
}
