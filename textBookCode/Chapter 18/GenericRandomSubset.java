import java.util.*;

/**
  This program shows how to generate a random subset of a set S
  when S is given as a generic list.
*/

public class GenericRandomSubset <T>
{
   public static void main(String[] args)
   {
      // Create a random subsets object specialized for strings
      Subsets<String> strSubsets = new Subsets<>();
      
      String [] people = {"Moe", "Curly", "Larry", "Bobby", "Stinky"};
      
      // Transform the array into a list
      List<String> peopleList = Arrays.asList(people);
      System.out.println(strSubsets.getRandomSubset(peopleList));
      System.out.println(strSubsets.getRandomSubset(peopleList));
      System.out.println(strSubsets.getRandomSubset(peopleList));
   }
}

class Subsets<T>
{
   Random rand = new Random();
   
   /**
     This method computes a random subset of an input set.
     @param argList: represents the input set
     @return a list representing a random subset of a set
   */
   
   List<T> getRandomSubset(List<T> argList)
   {
      List<T> resultList = new ArrayList<T>();
      int argListSize = argList.size();
      
      // Compute the size of the power set of the input set.
      int powerSetSize = Integer.rotateLeft(1,argListSize);
      
      // Select a random integer in the range 0 to powerSetSize-1.
      int randomInt = rand.nextInt(powerSetSize);
      
      // Convert the random integer to a subset
      String subsetStr = Integer.toBinaryString(randomInt);
      
      // Interpret each bit in the string as an element
      int length = subsetStr.length();
      for (int k = 0; k < length; k++)
      {
         if (subsetStr.charAt(k) == '1')
            resultList.add(argList.get(k + argList.size()-length));
      }
      return resultList;
   }
}