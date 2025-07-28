import java.util.Scanner;

/**
* @author Brent Barrows
*/
public class RestaurantBill 
{
  public static void main(String[] args) { 
  // write your code here
  // 1. Set constant tax rate to 0.1
  final double TAX_RATE = 0.10;
  // 2. Enter the bill amount
  try (Scanner scanner = new Scanner(System.in)) {
  System.out.print("Enter the bill amount: ");
  double billAmount = scanner.nextDouble();
  // 3. Enter the tip
  System.out.print("Enter the tip percentage: ");
  double tipPercentage = scanner.nextDouble() / 100; // Convert percentage to decimal

  // 4. Ask for tip after calculating tax
  double preTipAmount = billAmount + (billAmount * TAX_RATE);
  double tipAmount = preTipAmount * tipPercentage;
  double totalAmount = preTipAmount + tipAmount;

  // 5. Output the calculated amounts
  System.out.printf("Bill Amount: %.2f\n", billAmount);
  System.out.printf("Tax Amount: %.2f\n", billAmount * TAX_RATE);
  System.out.printf("Pre-Tip Amount (Bill + Tax): %.2f\n", preTipAmount);
  System.out.printf("Tip Amount: %.2f\n", tipAmount);
  System.out.printf("Total Amount (Including Tip): %.2f\n", totalAmount);
    }
  }
}
