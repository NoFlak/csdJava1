import java.util.Scanner;
/**
 *
 * @author Brent Barrows
 */
public class CircleArea {

    
    public static void main(String[] args) {
      
    
    // ********* Problem 2: Circle Area Problem ***********
    
    // TODO Implement the following step-by-step plan
    
    // 1. Declare double constant PI to hold 3.14
    final double PI = 3.14;
    // 2. Declare a double variable to store radius
    double radius;
    // 3. Declare a double variable to store area   
    double area;
    // 4. Prompt the user to enter radius. 
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Radius: ");
    // 5. Input radius and store it in variable
    radius = input.nextDouble();
    // 6. Calculate circle area. Find the formula on the web if you don't remember it
    area = PI * (radius * radius);
    // 7. Output the circle's radius and area values in user-friendly fashion
    System.out.printf("The radius of the circle is %.2f and the area is %.2f\n", radius, area);
    // ********* End of Circle Area Problem code area ***********
  
    }
    
}
