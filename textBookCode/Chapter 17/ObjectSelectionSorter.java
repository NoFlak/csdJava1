/**
   The ObjectSelectionSorter class provides a public static
   method for performing a selection sort on an array of
   objects that implement the Comparable interface.
*/

public class ObjectSelectionSorter
{

   /**
      The selectionSort method performs a selection sort on an
      array of objects that implement the Comparable interface.
      @param array The array to sort.
   */

   public static void selectionSort(Comparable[] array)
   {
      int startScan;       // Starting position of the scan
      int index;           // To hold a subscript value
      int minIndex;        // Element with smallest value in the scan
      Comparable minValue; // The smallest value found in the scan

      // The outer loop iterates once for each element in the
      // array. The startScan variable marks the position where
      // the scan should begin.
      for (startScan = 0; startScan < (array.length-1); startScan++)
      {
         // Assume the first element in the scannable area
         // is the smallest value.
         minIndex = startScan;
         minValue = array[startScan];
         
         // Scan the array, starting at the 2nd element in
         // the scannable area. We are looking for the smallest
         // value in the scannable area. 
         for(index = startScan + 1; index < array.length; index++)
         {
            if (array[index].compareTo(minValue) < 0)
            {
               minValue = array[index];
               minIndex = index;
            }
         }

         // Swap the element with the smallest value 
         // with the first element in the scannable area.
         array[minIndex] = array[startScan];
         array[startScan] = minValue;
      }
   }
}