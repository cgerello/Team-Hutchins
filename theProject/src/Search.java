import java.util.*;
import java.io.*;

public class Search {
    static String searchInput; //Change from static later

    public Search(String searchInput){
        this.searchInput = searchInput;
        //getResults();
    }

    public static void getResults(String searchInput){ //Get rid of static afterwards and return string, get rid of parameter
        try {
            File classFile = new File("theProject/src/classFile.txt");
            Scanner classScan = new Scanner(classFile);
            String data = "";
            while (classScan.hasNextLine()) {
                data = classScan.nextLine();
                Scanner dataScan = new Scanner(data);
                dataScan.useDelimiter(",");
                while (dataScan.hasNext()){
                    String theString = dataScan.next();
                    System.out.println(dataScan.next());
                    if (theString.equalsIgnoreCase(searchInput)){
                        System.out.println("Match found for: " + searchInput);
                    }
                }
                dataScan.close();
            }
            classScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void addFilter(){ //Work on this

    }

    public static void main(String[] args){ //Temporary main for testing
        getResults("HAL");
    }
}
