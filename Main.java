import java.io.File;  
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

      // Array to keep all the items of the current list
      ArrayList<String> items = new ArrayList<String>(); 

      //Sets the month to "EveryMonth" so it will create a file for the items to do every time.
      String month = "EveryMonth"; 
        
      try {
    
        File fullList = new File("maintenenceItems.txt");
        Scanner myReader = new Scanner(fullList);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          
          //Creates a file for previous month when it gets to new month.
          if (data.length() == 3){ 
            createFile.create(month); //Creates a file for month
            writeFile.write(month, items); //Writes month and array of items to file.
            items.clear(); //Clears array for the next month.
            month = data; //sets the new month
          }

          items.add(data); //Adds items to array to be printed later.
        }
        myReader.close();


      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }

      // Finds the current month and converts it to a 3 letter string.
      LocalDateTime myDateObj = LocalDateTime.now();
      DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("MMM");
      String formattedDate = myDateObj.format(currentDate);
      
      // Prints the items to do every month, and for the current month.
      String nowFile = formattedDate.concat("List.txt");
      printFile.printFileLines("EveryMonthList.txt");
      printFile.printFileLines(nowFile);

  }
}