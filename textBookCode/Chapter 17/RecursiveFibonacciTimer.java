import java.util.Scanner;

/**
 * This program times calls to the recursive Fibonacci method
 * for 6 consecutive calls and displays the results.
 */

public class RecursiveFibonacciTimer
{
  public static void main(String[] args)
  {
     // Get the starting argument
     System.out.println("Enter a positive integer:");
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();

     // Variables used to determine time for a function call
     long currentTime = System.currentTimeMillis();
     long previousTime;
     long elapsedTime = 0;

     for (int k = 0; k <= 5; k++)
     {
       // Record time before function call
       previousTime = currentTime;
       System.out.print("The Fibonacci term at position ");
       System.out.print((number + k)  + " is " );
       
       // Compute and print fib term for the next argument
       System.out.println(fib(number + k));
       
       // Record time after function call
       currentTime = System.currentTimeMillis();
       
       // Compute and print elapsed time in seconds
       elapsedTime = (currentTime - previousTime)/1000;
       System.out.println("Computed in " + elapsedTime + " seconds.");
     }
  }
  
  /**
   * Computes a term of the Fibonacci sequence
   * @param n
   * @return nth term of the sequence
   */
    public static long fib(long n)
    {
       if (n <=1)
           return 1;
       else
           return fib(n-2) + fib(n-1);
    }
}
