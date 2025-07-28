import java.util.Scanner;   // Needed for Scanner class
import java.io.*;           // Needed for File I/O classes

/**
   This program writes data to a file. It makes sure the
   specified file does not exist before opening it.
*/

public class FileWriteDemo2
{
   public static void main(String[] args) throws IOException
   {
      String filename;      // File name
      String friendName;    // Friend's name
      int numFriends;       // Number of friends

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of friends.
      System.out.print("How many friends do you have? ");
      numFriends = keyboard.nextInt();
      // Consume the remaining newline character.
      keyboard.nextLine();
      
      // Get the filename.
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();
      
      // Make sure the file does not exist.
      //db: if the file exists, then we abort the program
      //as we don't want to overwrite the file
      File file = new File(filename);
      if (file.exists())
      {
         System.out.println("The file " + filename + " already exists.");
         System.exit(0);
      }

      // Open the file.
      /*DB: You might wonder why we can't write directly to a file directly
      //without using printwriter. I asked bing copilot, and this was its response

      // Yes, you can write to a file without using PrintWriter in Java. However, PrintWriter offers several advantages that make it a preferred choice in many scenarios:
      // Formatted Output: PrintWriter provides methods like print(), println(), and printf() for writing formatted text to a file. This makes it easier to write human-readable text with proper formatting (Copilot, 2024).
      // Error Handling: Unlike FileWriter, PrintWriter does not throw IOException directly. Instead, it has a checkError() method to check for errors after performing write operations (Copilot, 2024).
      // Convenience: PrintWriter can wrap other output streams, such as FileWriter, 
      //to provide a more convenient interface for writing text data (Copilot, 2024).
       */
      PrintWriter outputFile = new PrintWriter(file);
      // Get data and write it to the file.
      for (int i = 1; i <= numFriends; i++)
      {
         // Get the name of a friend.
         System.out.print("Enter the name of friend " + "number " + i + ": ");
         friendName = keyboard.nextLine();

         // Write the name to the file.
         outputFile.println(friendName);
      }

      // Close the file.
      outputFile.close();

      //db: close the scanner
      keyboard.close();
      System.out.println("Data written to the file.");
   }
}