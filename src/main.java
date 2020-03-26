public class main {
    public static void main(String[] args) {
        Point point = new Point(10,10);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(20,20,15,15);
        System.out.println(moveablePoint);
        moveablePoint.setSpeed(45,50);
        System.out.println(moveablePoint);
        moveablePoint.move(moveablePoint);
        System.out.println(moveablePoint);
    }
}
