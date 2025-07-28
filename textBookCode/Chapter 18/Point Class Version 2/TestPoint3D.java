/**
   This program demonstrates the Point3D class.
*/

public class TestPoint3D
{
   public static void main(String[] args)
   {
      // Create a Point3D object that can hold Integers.
      Point3D<Integer> point = new Point3D<>(10, 20, 30);

      // Display the coordinates stored in point.
      System.out.println("Here are the values in point.");
      System.out.println("X Coordinate: " + point.getX());
      System.out.println("Y Coordinate: " + point.getY());
      System.out.println("Z Coordinate: " + point.getZ());
   }
}