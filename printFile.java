import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class printFile {

    // prints out each line of the file given as its parameter.
    public static void printFileLines(String filename){
        try {
            File currentList = new File(filename);
            Scanner myReader = new Scanner(currentList);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);

            }
            myReader.close();

          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
    }
}
