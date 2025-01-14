package gr.aueb.cf.ch14;

public class Point2D extends Point{
    private double y;

    public Point2D() {
       // etsi kai allios me 0 ksekinane
        // super();
       // y = 0;
    }

    public Point2D(double x, double y) {
        super(x); //setX(x)
        this.y = y;
    }

    //get kai set gia x klironomise

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.pointToString() + "(" + y + ")";
    }

    //    @Override
//    public String pointToString() {
//        return super.pointToString()  + "(" + y + ")";
//    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }
}
