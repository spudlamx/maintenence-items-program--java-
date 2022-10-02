import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;   

public class writeFile {
    //T akes an array and file name as perameter, and prints each item in the array into the file.
    public static void write(String fileName, ArrayList<String> list) {
        try {
            FileWriter myWriter = new FileWriter(fileName.concat("List.txt"));
            for (String item : list){
                myWriter.write(item.concat("\n"));
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}