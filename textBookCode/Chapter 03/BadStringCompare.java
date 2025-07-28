/**
   This program uses the == operator to compare two String objects.
   Although the comparison returns true in this case, it's not reliable
   practice for comparing string content. Use .equals() instead.
*/

/*
public class BadStringCompare
{
   public static void main(String [] args)
   {
      String name1 = "Mark",      // Interned string literal
             name2 = "Mark";      // Reuses the same interned object

      // Compares object references, not string content
      // Returns true due to interning, but this isn't safe in general
      if (name1 == name2)
      {
         System.out.println(name1 + " and " + name2 +
                            " are the same.");
      }
      else
      {
         System.out.println(name1 + " and " + name2 +
                            " are NOT the same.");
      }

      // Best practice: Use .equals() for string content comparison
      if (name1.equals(name2))
      {
         System.out.println("Using .equals(): names match by content.");
      }
   }
}
*/

//the above is gaddis's code
//the below is code bing copilot created to address all possibilities
//between string comparison using either the string pool or the heap

public class BadStringCompare {
   public static void main(String[] args) {
      String s1 = "Hello"; // String literal, stored in the string pool
      String s2 = "Hello"; // Reuses the same object from the string pool

      String s3 = new String("Hello"); // New object in the heap
      String s4 = new String("Hello"); // Another new object in the heap

      System.out.println(s1 == s2); // true, same object in the string pool
      System.out.println(s1 == s3); // false, different objects (pool vs heap)
      System.out.println(s3 == s4); // false, different objects in the heap
      System.out.println(s1.equals(s3)); // true, same content
   }
}