 /**
   * This program shows how to use breadth first search
   * based on a queue to do a directory search.
   */
  import java.io.File;
  import java.util.*;

  public class DirSearch
  {
     public static void main(String[] args)
     {
        File initDir = new File("C:/Users/gcm");
        String filePath = search(initDir, "Menus.tex");
        if (filePath == null)
            System.out.println("Not found");
        else
            System.out.println(filePath);
     }

     /**
      * This method searches a given directory and all its
      * subdirectories looking for specified file or subdirectory.
      * @param initDir : the initial directory to search.
      * @param searchFileName : the name of the file or subdirectory
      *                         to search for.
      * @return the full path name of the searched for file or directory.
      */
     static String search(File initDir, String searchFileName)
     {
       Queue<File> directoriesToSearch = new LinkedList<File>();
       directoriesToSearch.add(initDir);

       while (!directoriesToSearch.isEmpty())
       {
           // Get next directory to search
           File currDir = directoriesToSearch.remove();
           // Get contents of current directory
           String[] dirContents = currDir.list();
           // Directory contents will be null if there is
           // a problem listing the directory contents
           if (dirContents == null) continue;
           // Do the directory contents contain the desired file?
           if (Arrays.asList(dirContents).contains(searchFileName))
           {
               return currDir.getAbsolutePath();
           }
           // Desired file not in current directory
           // Add all the children of this directory to the queue
           // of directories to be searched
           File [] childDirectories = currDir.listFiles();
           for (File f : childDirectories)
           {
               if (f.isDirectory())
                   directoriesToSearch.add(f);
           }
       }
       // No more directories left to search, so not found
       return null;
     }
 }

