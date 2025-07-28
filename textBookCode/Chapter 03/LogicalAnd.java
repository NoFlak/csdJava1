import javax.swing.JOptionPane;  // Needed for JOptionPane class

/**
   This program demonstrates the logical && operator.
   It also shows how Java handles comparisons between different numeric types.
*/

public class LogicalAnd {
   public static void main(String[] args) {
      double salary;       // Annual salary
      double yearsOnJob;   // Years at current job
      String input;        // To hold string input

      // Get the user's annual salary.
      input = JOptionPane.showInputDialog("Enter your " + "annual salary.");
      salary = Double.parseDouble(input);

      // Get the number of years at the current job.
      input = JOptionPane.showInputDialog("Enter the number of " + "years at your current job.");
      yearsOnJob = Double.parseDouble(input);

      /*
         Determine whether the user qualifies for the loan.

         Important: The salary comparison uses an integer literal: 30000

         - salary is of type double
         - 30000 is an int literal

         Java handles this by automatically promoting the int literal to a double (30000.0)
         before performing the comparison.

         This behavior is safe and legal in Java because it supports implicit type promotion
         when comparing numeric values of different types.

         ⚠️ Teaching tip: Although this works fine here, precision matters—
         especially when working with decimal thresholds. If appropriate,
         it's clearer to write 30000.0 to reflect that salary is a decimal value.
      */
      if (salary >= 30000 && yearsOnJob >= 2) {
         JOptionPane.showMessageDialog(null, "You qualify for the loan.");
      } else {
         JOptionPane.showMessageDialog(null, "You do not qualify for the loan.");
      }

      // Graceful exit from the program
      System.exit(0);
   }
}
