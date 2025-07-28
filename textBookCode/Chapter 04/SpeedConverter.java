/**
   This program displays a table of speeds in
   kph converted to mph.
*/

public class SpeedConverter
{
   public static void main(String[] args)
   {
      // Constants
	  //db: final means the value can't change
      final int STARTING_KPH = 60; // Starting speed
      final int MAX_KPH = 130;     // Maximum speed
      final int INCREMENT = 10;    // Speed increment
      
      // Variables
      int kph;       // To hold the speed in kph
      double mph;    // To hold the speed in mph
      
      // Display the table headings.
      System.out.println("KPH\t\tMPH");
      System.out.println("-------------------");
      
      // Display the speeds.
      for (kph = STARTING_KPH; kph <= MAX_KPH; kph += INCREMENT)
      {
         // Calculate the mph.
         mph = kph * 0.6214;
         
         // Display the speeds in kph and mph.
         System.out.printf("%d\t\t%.1f\n", kph, mph);

         //db:
         //the line of code above using System.out.printf
         //be converted to System.out.printlb
         //System.out.println(kph + "\t\t" + String.format("%.1f", mph));
      }
   }
}
