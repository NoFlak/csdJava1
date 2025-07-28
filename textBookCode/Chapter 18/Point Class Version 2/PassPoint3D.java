/**
   This program passes a Point3D object to a method
   with a Point parameter variable.
*/

public class PassPoint3D
{
   public static void main(String[] args)
   {
      // Create a Point3D object that can hold Integers.
      Point3D<Integer> point = new Point3D<>(10, 20, 30);

      // Display the X and Ycoordinates stored in point.
      System.out.println("Here are the X and Y coordinates.");
      printPoint(point);
   }

   /**
      The printPoint method prints a Point object's
      X and Y coordinates.
      @param point A Point object.
   */

   public static void printPoint(Point<?> point)
   {
      System.out.println("X Coordinate: " + point.getX());
      System.out.println("Y Coordinate: " + point.getY());
   }
}