package gr.aueb.cf.ch14;

public class Point {
    private double x;

    public Point(){
    }
    public Point(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

//    //klhronomithike apo thn object
//    @Override
//    public String toString() {
//        return "Point{" +
//                "x=" + x +
//                '}';
//    }

        public String pointToString(){
        return "(" + x + ")";
    }

    // api
    public void movePlus10(){
        x += 10;
    }

    // δεν κληρονομούντε οι Private
    private void reset() {
        x = 0;
    }
    // οι Protected ομως κληρονομούντε
    protected void movePlusOne() {
        x += 1;
    }
}
