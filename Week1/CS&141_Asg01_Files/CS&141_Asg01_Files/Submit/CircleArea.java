

import java.util.Scanner;

/*
 * Title: [Circle Area Project]
 * 
 * Description: 
 * [Provide a brief overview of the project. Include the purpose, functionality, and key features.]
 * 
 * Requirements:
 * 1. [As stated in the assignment template, the program must be able to calculate the area of a circle given its radius.]
 * 
 * Changelog:
 * - [Version 1.0] - [Date]:4/3/2025 [Built out and tested]
 * 
 * @author Brent Barrows
 * Date: 4/3/2025
 * Class: CS& 141 Java 1
 * Institution: LakeWashingtonTech
 */
public class CircleArea {

    
    public static void main(String[] args) {
      
    
    // ********* Problem 2: Circle Area Problem ***********
    
    // 1. Declare double constant PI to hold 3.14
    final double PI = 3.14;
    // 2. Declare a double variable to store radius 
    double radius;
    // 3. Declare a double variable to store area   
    double area;
    // 4. Prompt the user to enter radius. 
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    // 5. Input radius and store it in variable
    radius = scanner.nextDouble();
    // 6. Calculate circle area. Find the formula on the web if you don't remember it
    area = PI * radius * radius;
    // 7. Output the circle's radius and area values in user-friendly fashion
    System.out.printf("The radius of the circle is %.2f and the area is %.2f.\n", radius, area);
        
    scanner.close();
    
  
    }
    
}
