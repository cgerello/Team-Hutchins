import java.util.*;
import java.io.*;

public class Search {
    String searchInput;

    public Search(String searchInput){
        this.searchInput = searchInput;
    }



    public static void main(String[] args){ //Temporary main for testing
        try {
            File classFile = new File("classFile.txt");
            Scanner classScan = new Scanner(classFile);
            while (classScan.hasNextLine()) {
                String data = classScan.nextLine();
                System.out.println(data);
            }
            classScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
