/**
   This program demonstrates how the Integer.parseInt
   method throws an exception.
*/

public class ParseIntError
{
   public static void main(String[] args)
   {
       String str = "abcde";
       int number;

       try
       {
         //db: exception occurs because "abcde" can't be convrted 
         //to an int
          number = Integer.parseInt(str);
       }
       catch (NumberFormatException e)
       { 
          System.out.println("Conversion error: " +
                             e.getMessage());
       }
   }
}