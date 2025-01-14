package gr.aueb.cf.ch14;

public class PointMain {
    public static void main(String[] args) {
        Point point = new Point();
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();

        doMovePlush10(point);
        doMovePlush10(point2D);
        doMovePlush10(point3D);

        //Point2D ISAPOINT
        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        doPrint(p2);
        doPrint(p3);

        p2.movePlus10();
        p2.movePlusOne();

        p3.movePlus10();

//        δεν μπορούμε να καλέσουμε γιατί΄είναι όλα point και το Point δεν έχει υ
//        p2.setY(12);
        ((Point2D) p2).setY(12);
    }

    public static  void doMovePlush10 (Point point){
        point.movePlus10();
    }

    public static void doPrint (Point point) {
        System.out.println(point);
    }
}
