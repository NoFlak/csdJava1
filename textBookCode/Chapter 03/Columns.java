/**
   This program displays a variety of
   floating-point numbers with their decimal points aligned.
   Each number is formatted using the specifier %8.2f, which means:

     - The field will be at least 8 characters wide
     - The number will be rounded to 2 digits after the decimal point
     - If the formatted number is shorter than 8 characters, it will be right-aligned
       with spaces added to the left for padding
     - If the formatted number exceeds 8 characters, Java will expand the field
       automatically — it does NOT truncate the number

   This illustrates a key teaching point: Java formatting specifiers define
   minimum width, not maximum width limits. Formatted output adapts to
   preserve precision and readability.
*/

public class Columns {
   public static void main(String[] args) {
      // Declare a variety of double variables
      double num1 = 127.899;
      double num2 = 3465.148;
      double num3 = 3.776;
      double num4 = 264.821;
      double num5 = 88.081;
      double num6 = 1799.999;

      // DB: Added to test behavior when the formatted result exceeds 8 characters
      double blodgettNum = 17999999999999999999.0;

      /*
         Each line below uses %8.2f formatting.

         Teaching insight:
         - For small numbers: output is padded with leading spaces for alignment.
         - For large numbers: output expands beyond 8 characters without error.

         This helps demonstrate that Java prioritizes accurate formatting
         and does not clip numbers that are too wide.
      */
      System.out.printf("%8.2f\n", num1);       // Prints:   127.90
      System.out.printf("%8.2f\n", num2);       // Prints:  3465.15
      System.out.printf("%8.2f\n", num3);       // Prints:     3.78
      System.out.printf("%8.2f\n", num4);       // Prints:   264.82
      System.out.printf("%8.2f\n", num5);       // Prints:    88.08
      System.out.printf("%8.2f\n", num6);       // Prints:  1800.00

      System.out.printf("%8.2f\n", blodgettNum); // Prints: 17999999999999999488.00 (expands far beyond 8 chars)
   }
}
