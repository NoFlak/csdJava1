import java.util.*;


class MyStack
{
  private int [ ] s;
  private int top = -1;
  
  public MyStack(int capacity)
  {
    s = new int[capacity];
  }
  
  int pop()
  {
    if (empty())
	   throw new RuntimeException("Stack Empty");
	 top --;
	 return s[top+1];
  }
  
  void push(int x)
  {
    if (top == s.length-1)
	   throw new RuntimeException("Stack Overflow");
    top ++;
	 s[top] = x;
  }
  
  boolean empty()
  {
    return top == -1;
  }
}


public class GenericStackDemo
{

 public static void main(String [ ] arg)
 {
   MyStack stack = new MyStack(5);
	
	stack.push(23);
	stack.push(34);
	while (!stack.empty())
	{
	  System.out.println(stack.pop());
	}  
	for (int k = 1; k < 10; k++)
	  stack.push(k);	 
 }
}

