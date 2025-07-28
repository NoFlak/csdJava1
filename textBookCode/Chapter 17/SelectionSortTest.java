/**
   This program tests the selectionSort method in the
   IntSelectionSorter class.
*/

public class SelectionSortTest
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
      IntSelectionSorter.selectionSort(values);

      // Display the array's contents.
      System.out.println("\nSorted order: ");
      for (int element : values)
         System.out.print(element + " ");
         
      System.out.println();
   }
}