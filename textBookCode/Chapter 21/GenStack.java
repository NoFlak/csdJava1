/**
   This class implements a generic array
	based stack.
*/

public class GenStack<T>
{
   private T [] s;   // Body of stack
   private int top;  // Stack top pointer
   
   /**
      Constructor.
      @param capacity The capacity of the stack.
   */
	
   public GenStack (int capacity)
   {
       s = (T[ ]) new Object [capacity];
       top = 0;
   }
   /**
      The empty method checks to see if 
		the stack is empty.
      @return true if and only if the 
		stack is empty.
   */
   
   public boolean empty() { return top == 0; }
   
   /**
      The push  method adds x to the stack.
      @param x the value to be pushed onto 
		the stack.
      @return the value that was pushed 
		onto the stack.
		@exception StackOverFlowException When
		the stack is full.
   */
   
   public T push(T x) 
   {
       if (top == s.length)  
           throw new StackOverFlowException();
       else
       {
          s[top] = x;
          top ++;  
          return x;
       }         
   }
   
   /**
      The pop method removes and returns the
      item at the top of the stack.
      @return item at the top of the stack.
		@exception EmptyStackException When the
		stack is empty.
   */
   
   public T pop()
   {
       if (empty())
           throw new EmptyStackException();
       else
       {
          T retVal = s[top-1];
          s[top-1] = null;
          top--;
          return retVal;
       }
   }
}