//db: need this to get acces to Random Object
//db: think of java.util.Random as a package
import java.util.Random;

/**
   This program simulates 10 tosses of a coin.
*/

public class CoinToss
{
   public static void main(String[] args)
   {
      // Create a Random object to generate random numbers.
      Random rand = new Random();
		
		// Simulate the coin tosses.
		for (int count = 0; count < 10; count++)
		{
			//db:
			//The rand.nextInt(2) method call generates a random integer between 0 (inclusive) and 2 (exclusive)
			if (rand.nextInt(2) == 0)
				System.out.println("Tails");
			else
				System.out.println("Heads");
		}
	}
}
