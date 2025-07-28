/**
   The Point3D class holds a Z coordinate. The data type
   of the coordinate is generic.
*/

public class Point3D<T extends Number> extends Point<T>
{
   private T zCoordinate;  // The z coordinate
   
   /**
      Constructor
      @param x The X coordinate.
      @param y The Y coordinate.
      @param z The Z coordinate.
   */
   
   public Point3D(T x, T y, T z)
   {
      // Call the Point class constructor.
      super(x, y);
      
      // Assign the Z coordinate.
      zCoordinate = z;
   }
   
   /**
      The setZ method sets the Z coordinate.
      @param z The value for the Z coordinate.
   */
   
   public void setZ(T z)
   {
      zCoordinate = z;
   }

   /**
      The getZ method returns the Z coordinate.
      @return The value of the Z coordinate.
   */
   
   public T getZ()
   {
      return zCoordinate;
   }
}
