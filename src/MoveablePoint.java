public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(){

    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arrSpeed = {this.xSpeed, this.ySpeed};
        return arrSpeed;
    }

    public MoveablePoint move(MoveablePoint moveablePoint){
        moveablePoint.setX(moveablePoint.getX() + this.xSpeed);
        moveablePoint.setY(moveablePoint.getY() + this.ySpeed);
        return moveablePoint;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x = " + this.getX() +
                " y = " + this.getY() +
                " xSpeed=" + xSpeed +
                ", y Speed=" + ySpeed +
                '}';
    }
}
