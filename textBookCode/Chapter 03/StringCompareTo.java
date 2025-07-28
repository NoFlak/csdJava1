/**
   This program compares two String objects using
   the compareTo method.
*/

public class StringCompareTo
{
   public static void main(String [] args)
   {
      String name1 = "Mary",
             name2 = "Mark";

      // Compare "Mary" and "Mark"

      //notes from me, db:
      //equals will take any Object as a parameter, but compareTo will only take Strings. 
      //note: how compareTo will tell you more than equals;
      //it will tell you if they are equal, or if different,
      //then how they are different

      if (name1.compareTo(name2) < 0)
      {
         System.out.println(name1 + " is less than " + name2);
      }
      else if (name1.compareTo(name2) == 0)
      {
         System.out.println(name1 + " is equal to " + name2);
      }
      else if (name1.compareTo(name2) > 0)
      {
         System.out.println(name1 + " is greater than " + name2);
      }
   }
}
