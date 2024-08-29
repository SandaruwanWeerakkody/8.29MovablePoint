public class Movable extends Point {
    private double xSpeed;
    private double ySpeed;

    public Movable(double xSpeed ,double ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public Movable(){
        super();
        xSpeed =2;
        ySpeed =3;
    }
    public Movable(double x,double y,double xSpeed, double ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed =ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(double xSpeed, double ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "Movable{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void move (){
        double newX = super.getX() + xSpeed;
        double newY = super.getY() + ySpeed;

        super.setX(newX);
        super.setY(newY);

        System.out.println("Point move to ("+newX+" , "+newY+")");
    }
}
