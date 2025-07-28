import java.io.*;    // For File class and FileNotFoundException
import java.util.*;  // For Scanner and InputMismatchException

/**
   This program demonstrates how multiple exceptions can
   be caught with a single catch clause.
*/

public class MultiCatch
{
   public static void main(String[] args)
   {
      int number;    // To hold a number from the file
      
      try
      {
         // Open the file.
         File file = new File("Numbers.txt");
         Scanner inputFile = new Scanner(file);

         // Process the contents of the file.
         while (inputFile.hasNext())
         {
            // Get a number from the file.
            //db: exception will occur because file has 
            //20.76 which is not an int
            number = inputFile.nextInt();
            
            // Display the number.
            System.out.println(number);
         }

         // Close the scannner object and the file it has open
         inputFile.close();
      }
      catch(FileNotFoundException | InputMismatchException ex)
      {
         // Display an error message.
         System.out.println("Error processing the file.");
      }
      
      /*
      //db: note the above can be written using the more traditional syntax as
      catch(FileNotFoundException ex)
      {
         // Display an error message.
         System.out.println("Error processing the file.");
      }
      catch (InputMismatchException ex)
      {
         System.out.println("Error processing the file.");
      }
      */
   }
}