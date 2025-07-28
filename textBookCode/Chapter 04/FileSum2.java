import java.util.Scanner; 
import java.io.*;

/**
   This version of the program confirms that the
   Numbers.txt file exists before opening it.
*/

public class FileSum2
{
   public static void main(String[] args) throws IOException
   {
      double sum = 0.0;   // Accumulator, initialized to 0

      //db: again, use a file as input to the scanner object
      // Make sure the file exists.

      //db: check if the file doesn't exist
      //if the file doesn't, then just exit
      File file = new File("Numbers.txt");
      if (!file.exists())
      {
         System.out.println("The file Numbers.txt is not found.");

         //db: note that exiting with a status of 0
         //isn't negative in any way
         //it's just saying the process that is running the code
         //has successfully completed running the code from
         //an operating system perspective
         System.exit(0);
      }
      
      // Open the file for reading.
      Scanner inputFile = new Scanner(file);

      // Read all of the values from the file
      // and calculate their total.
      while (inputFile.hasNext())
      {
         // Read a value from the file.
         double number = inputFile.nextDouble();
         
         // Add the number to sum.
         sum = sum + number;
      }

      // Close the file.
      //db: well, keep in mnd that closing the scanner
      //will also close th underlying file the scanner
      //it is using
      inputFile.close();

      // Display the sum of the numbers.
      System.out.println("The sum of the numbers in " +
                         "Numbers.txt is " + sum);
   }
}
