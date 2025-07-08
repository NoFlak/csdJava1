/**
* @author Brent Barrows
*/
import java.util.Scanner;
public class RestaurantBill 
{
  public static void main(String[] args) { 
  // write your code here
  // 1. Declare bill amount and set constant tax rate to 0.1
  final double TAX_RATE = 0.10;
// seems to work when using try to handle the Scanner, but issue stemmed from not all code being inside the try statement. 
  // 2. Use try-with-resources to manage the Scanner
try (Scanner scanner = new Scanner(System.in)) {
  System.out.print("Enter the bill amount: ");
  double billAmount = scanner.nextDouble();

  System.out.print("Enter the tip percentage: ");
  double tipPercentage = scanner.nextDouble() / 100; // Convert percentage to decimal

  // 3. Ask for tip after calculating tax
  double preTipAmount = billAmount + (billAmount * TAX_RATE);
  double tipAmount = preTipAmount * tipPercentage;
  double totalAmount = preTipAmount + tipAmount;

  // 4. Output the calculated amounts
  System.out.printf("Bill Amount: %.2f\n", billAmount);
  System.out.printf("Tax Amount: %.2f\n", billAmount * TAX_RATE);
  System.out.printf("Pre-Tip Amount (Bill + Tax): %.2f\n", preTipAmount);
  System.out.printf("Tip Amount: %.2f\n", tipAmount);
  System.out.printf("Total Amount (Including Tip): %.2f\n", totalAmount);
    }
  }
}

// This code calculates the total amount of a restaurant bill including tax and tip. Although it may be a bit messy and unsufisticated, it works. Note to self using try resources make sure relevant code is contained inside the try statement.
// I am not sure if this is the best way to do it or if I will lose points, but it works. I will have to look into it more after grading and appreciate any notes or things you'd like included in future programs like comments.
//                                -Brent Barrows