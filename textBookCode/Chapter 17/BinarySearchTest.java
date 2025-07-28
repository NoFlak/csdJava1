import java.io.*;

/**
   This program demonstrates the search method in
   the IntBinarySearcher class.
*/

public class BinarySearchTest
{
   public static void main(String [] args) throws IOException
   {
      int result, searchValue;
      String input;
      
      // An array of numbers to search.
      int numbers[] = { 536, 289, 296, 429, 319, 142, 394,
                        101, 388, 147, 417, 199, 207, 222,
                        189, 310, 447, 521, 234, 600};
      
      // Create the console input objects.
      InputStreamReader reader =
                 new InputStreamReader(System.in);
      BufferedReader keyboard =
                 new BufferedReader(reader);

      // First we must sort the array in ascending order.
      IntQuickSorter.quickSort(numbers);
      
      do
      {
         // Get a value to search for.
         System.out.print("Enter a value to search for: ");
         input = keyboard.readLine();
         searchValue = Integer.parseInt(input);

         // Search for the value
         result = IntBinarySearcher.search(numbers, searchValue);

        // Display the results.
        if (result == -1)
           System.out.println(searchValue + " was not found.");
        else
        {
           System.out.println(searchValue + " was found at " +
                              "element " + result);
        }

        // Does the user want to search again?
        System.out.print("Do you want to search again? (Y or N): ");
        input = keyboard.readLine();
      } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
   }
}
