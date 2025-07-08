import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
* @author Brent Barrows
* Requirements:
* - Code must run correctly on the test cases.
*
*/

public class RandomsInFile {
    public static void main(String[] args) {
    // write your code here
        Random random = new Random();
        String fileName = "random_numbers.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100
                writer.write(randomNumber + "\n"); // Write the number to the file
            }
            System.out.println("Random numbers successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}

