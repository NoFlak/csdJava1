/**
   This program sequentially searches an
   int array for a specified value.
*/

public class SequentialSearchTest
{
   public static void main(String[] args)
   {
      int[] tests = { 87, 75, 98, 100, 82 };
      int results;

      // Search the array for the value 100.
      results = IntSequentialSearcher.search(tests, 100);

      // Determine whether 100 was found and
      // display an appropriate message.
      if (results == -1)
      {
         System.out.println("You did not " +
                    "earn 100 on any test.");
      }
      else
      {
         System.out.println("You earned 100 " +
                    "on test " + (results + 1));
      }
   }
}