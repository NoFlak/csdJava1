import javax.swing.JOptionPane;  // Needed for JOptionPane class

/**
   This program demonstrates the logical || operator.
   It also explains how Java handles numeric type comparisons.
*/

public class LogicalOr {
   public static void main(String[] args) {
      double salary;       // Annual salary (stored as a double)
      double yearsOnJob;   // Years at current job (also a double)
      String input;        // To hold string input from the user

      // Get the user's annual salary.
      input = JOptionPane.showInputDialog("Enter your annual salary:");
      salary = Double.parseDouble(input);

      // Get the number of years at the current job.
      input = JOptionPane.showInputDialog("Enter the number of years at your current job:");
      yearsOnJob = Double.parseDouble(input);

      /*
         Determine whether the user qualifies for the loan
         based on either income or time on job.

         Key Note:
         The condition compares salary >= 30000
         - 'salary' is a double
         - '30000' is an integer literal

         Java automatically promotes the integer to a double (30000.0)
         during the comparison to match the type of 'salary'.

         This is called *implicit type promotion*, and it's perfectly legal
         as long as no precision loss occurs in the context.

         The same happens for yearsOnJob >= 2 — '2' is an int,
         promoted to 2.0 for the comparison.

         This allows flexibility in writing clean conditional expressions
         without always having to explicitly write 30000.0 or 2.0.

         That said, using decimal notation (e.g. 30000.0) can
         improve readability when working with floating-point values.
      */

      if (salary >= 30000 || yearsOnJob >= 2) {
         JOptionPane.showMessageDialog(null, "You qualify for the loan.");
      } else {
         JOptionPane.showMessageDialog(null, "You do not qualify for the loan.");
      }

      // Exit the program gracefully
      System.exit(0);
   }
}
