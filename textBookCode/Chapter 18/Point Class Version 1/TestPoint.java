/**
   This program demonstrates the Point class.
*/

public class TestPoint
{
   public static void main(String[] args)
   {
      // Create two Double objects to use as coordinates.
      Double dblX = new Double(1.5);
      Double dblY = new Double(2.5);
      
      // Create a Point object that can hold Doubles.
      Point<Double> dPoint = new Point<>(dblX, dblY);
      
      // Create two Integer objects to use as coordinates.
      Integer intX = new Integer(10);
      Integer intY = new Integer(20);
      
      // Create a Point object that can hold Integers.
      Point<Integer> iPoint = new Point<>(intX, intY);

      // Display the Double values stored in dPoint.
      System.out.println("Here are the values in dPoint.");
      System.out.println("X Coordinate: " + dPoint.getX());
      System.out.println("Y Coordinate: " + dPoint.getY());
      System.out.println();

      // Display the Integer values stored in iPoint.
      System.out.println("Here are the values in iPoint.");
      System.out.println("X Coordinate: " + iPoint.getX());
      System.out.println("Y Coordinate: " + iPoint.getY());
   }
}