import java.util.*;

/**
   This program demonstrates the use
	of stacks with primitive types.
*/

public class StackDemo2
{    
    public static void main(String [] args)
    {
       Stack<Integer> intStack = new Stack<Integer>();
       
       // Push some numbers onto the stack
       for (int k = 1; k < 10; k++)
           intStack.push(k*k);
       
       // Pop and print all numbers
       while (!intStack.empty())
       {
           int x = intStack.pop();
           System.out.print( x + "  ");      
       }             
    }      
}
