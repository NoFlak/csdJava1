/**
   This program displays a variety of integer values using formatted output.
   It demonstrates how field width formatting behaves when numbers are either
   smaller than or exceed the specified width.

   Format specifier used: %8d
   - '8' = minimum field width of 8 characters
   - 'd' = display integer in decimal (base 10) format — NOTE: This does NOT imply a decimal point.
     It refers to whole-number formatting, unlike %f which is used for floating-point numbers.
   - Values will be right-aligned by default
   - If a number has more digits than 8, the field will expand automatically

   Teaching Point:
   Java treats the field width as a guideline — not a constraint. If a number’s digit length
   exceeds the specified width, it will still be printed in full with no truncation or error.
*/
public class LeftJustified {
   public static void main(String[] args) {
      // Declare a variety of integer variables
      int num1 = 123;          // 3 digits
      int num2 = 12;           // 2 digits
      int num3 = 45678;        // 5 digits
      int num4 = 456;          // 3 digits
      int num5 = 1234567;      // 7 digits
      int num6 = 1234;         // 4 digits

      // DB: Added to test what happens with a number that exceeds 8 characters
      int testNum = 123456789; // 9 digits

      // Display each variable left-justified
      // in a field of 8 spaces.
      //System.out.printf("%-8d%-8d\n", num1, num2);
      //System.out.printf("%-8d%-8d\n", num3, num4);
      //System.out.printf("%-8d%-8d\n", num5, num6);

      // DB: This way better with just one number per line → simplified
      /*
         Each printf line below uses the format %8d:

         For num1 through num6:
         - Output is right-aligned
         - Space padding is added to ensure the field is 8 characters wide

         For testNum:
         - It has 9 digits, which exceeds the field width of 8
         - Java prints the full number as-is, overriding the width
         - This shows that field width acts as a minimum, not a maximum
      */

      System.out.printf("%8d\n", num1);        // Prints:     123
      System.out.printf("%8d\n", num2);        // Prints:      12
      System.out.printf("%8d\n", num3);        // Prints:   45678
      System.out.printf("%8d\n", num4);        // Prints:     456
      System.out.printf("%8d\n", num5);        // Prints: 1234567
      System.out.printf("%8d\n", num6);        // Prints:    1234

      System.out.printf("%8d\n", testNum);     // Prints: 123456789 (no padding — field expands)
   }
}
