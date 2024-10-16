public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((a.getX() - b.getX()),2)+Math.pow((a.getY() - b.getY()),2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    // testing new Point constructor
    Point p4 = new Point(p3);
    Point p5 = new Point(p4);

    Point p6 = new Point(0,0);
    Point p7 = new Point(5,12);
    Point p8 = new Point(8,15);
    // testing toString
    System.out.println( p3);
    System.out.println(p4);
    System.out.println(p5);
    // testing static distance method in Demo
    System.out.println( distance(p6,p3));// Expected 5
    System.out.println( distance(p6, p7)); // Expected 13
    System.out.println( distance(p6, p8)); // Expected 17
    // testing non static distance method in Point
    System.out.println( Point.distance(p6,p3)); // Expected 5
    System.out.println( Point.distance(p6, p7)); // Expected 13
    System.out.println( Point.distance(p6, p8)); // Expected 17
    // testing static distance method in Point
    System.out.println( p6.distanceTo(p3)); // Expected 5
    System.out.println( p6.distanceTo(p7)); // Expected 13
    System.out.println( p6.distanceTo(p8)); // Expected 17
  }
}
