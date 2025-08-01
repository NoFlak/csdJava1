 import java.io.*;    // For File class and FileNotFoundException
 import java.util.*;  // For Scanner and InputMismatchException
 import javax.swing.JOptionPane; // For the JOptionPane class
 
 /**
    This program demonstrates how exception handlers can
    be used to recover from errors.
 */
  
 public class SalesReport2
 {
    public static void main(String[] args)
    {
       int months = 0;                    // Month counter
       double oneMonth;                   // One month's sales
       double totalSales = 0.0;           // Total sales
       double averageSales;               // Average sales
 
      //db: note this code won't actually generate an exception

       // Attempt to open the file by calling the
       // openfile method.
       String filename = "SalesData.txt"; // File name
       //db: call method openfile to open file in a 
       //scannner object
       Scanner inputFile = openFile(filename);
       
       // If the openFile method returned null, then
       // the file was not found. Get a new file name.
       //db: this while loop ensures we get a file open in
       //a scanner object
       while (inputFile == null)
       {
          filename = JOptionPane.showInputDialog(
                         "ERROR: " + filename +
                         " does not exist.\n" +
                         "Enter another file name: ");
          inputFile = openFile(filename);
       }
 
       // Process the contents of the file.
       //db: we get to this point we know
       //we have a scanner object open based on a file
       while (inputFile.hasNext())
       {
          try
          {
             // Get a month's sales amount.
             oneMonth = inputFile.nextDouble();
  
             // Accumulate the amount.
             totalSales += oneMonth;
                
             // Increment the month counter.
             months++;
          }
          catch(InputMismatchException e)
          {
             // Display an error message.
             JOptionPane.showMessageDialog(null,
                "Non-numeric data found in the file.\n" +
                "The invalid record will be skipped.");
             
             // Skip past the invalid data.
             //db: here is the so-called recoverability if we need it
             inputFile.nextLine();
          }
       }
 
       // Close the file.
       inputFile.close();
 
       // Calculate the average.
       averageSales = totalSales / months;
 
       // Display the results.
       JOptionPane.showMessageDialog(null,
          String.format("Number of months: %d\n" +
                        "Total Sales: $%,.2f\n" +
                        "Average Sales: $%,.2f",
                        months, totalSales, averageSales));
                        
       System.exit(0);
    }
 
    /**
       The opeFile method opens the specified file and
       returns a reference to a Scanner object.
       @param filename The name of the file to open.
       @return A Scanner reference, if the file exists
               Otherwise, null is returned.
    */
 
    public static Scanner openFile(String filename)
    {
       Scanner scan;
 
       // Attempt to open the file.
       try
       {
          File file = new File(filename);
          scan = new Scanner(file);
       }
       catch(FileNotFoundException e)
       {
          scan = null;
       }

       //db: return the scanner object that is based off of
       //the file SalesData.txt
       return scan;
    }
 }
