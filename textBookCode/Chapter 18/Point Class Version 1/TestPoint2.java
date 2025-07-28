/**
   This demonstrates the Point class without a type argument.
*/

public class TestPoint2
{
   public static void main(String[] args)
   {
      // Create an Integer and a Double
      // to use as coordinates.
      Integer x = new Integer(1);
      Double y = new Double(7.5);
      
      // Create a Point object with an
      // Integer x coordinate and a Double
      // y coordinate.
      Point myPoint = new Point(x, y);
      
      // Display the object's X and Y
      // coordinate values.
      System.out.println("X Coordinate: " +
                         myPoint.getX());
      System.out.println("Y Coordinate: " +
                         myPoint.getY());
   }
}