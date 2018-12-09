package point.model;

public class MoveablePoint extends Point{
  private float xSpeed;
  private float ySpeed;

  public MoveablePoint() {
    super();
    this.xSpeed = 0.0f;
    this.ySpeed = 0.0f;
  }

  public MoveablePoint(float xSpeed, float ySpeed) {
    super();
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
    super(x,y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public float getxSpeed() {
    return xSpeed;
  }

  public void setxSpeed(float xSpeed) {
    this.xSpeed = xSpeed;
  }

  public float getySpeed() {
    return ySpeed;
  }

  public void setySpeed(float ySpeed) {
    this.ySpeed = ySpeed;
  }

  public void setSpeed(float xSpeed, float ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public float[] getSpeed() {
    float[] xySpeedArray = {getxSpeed(), getySpeed()};
    return xySpeedArray;
  }

  @Override
  public String toString() {
    return String.format("%s, speed=(%.3f, %.3f)", super.toString(), getxSpeed(), getySpeed());
  }

  public MoveablePoint move() {
    setX(getX()+getxSpeed());
    setY(getY()+getySpeed());
    return this;
  }
}
