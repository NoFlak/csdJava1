/**
   This program tests the quickSort method in the
   IntQuickSorter class.
*/

public class QuickSortTest
{
   public static void main(String[] args)
   {
      // Create an int array with test values.
      int[] values = { 5, 1, 3, 6, 4, 2 };
      
      // Display the array's contents.
      System.out.println("Original order: ");
      for (int element : values)
         System.out.print(element + " ");
      
      // Sort the array.
      IntQuickSorter.quickSort(values);

      // Display the array's contents.
      System.out.println("\nSorted order: ");
      for (int element : values)
         System.out.print(element + " ");
         
      System.out.println();
   }
}