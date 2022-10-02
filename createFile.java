import java.io.File;
import java.io.IOException;

public class createFile {


  // Creates a text file with the filename given and prints success message.
    public static void create (String fileName) {
        try {
            File newFile = new File(fileName.concat("List.txt"));
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
              
              }
            } catch (IOException e) {
              System.out.println("An error occurred.");
              e.printStackTrace();
            }
          }    
   }

