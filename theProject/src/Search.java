import java.util.*;
import java.io.*;

public class Search {
    static String searchInput; //Change from static later
    //Temp course for writing a method
    public class Course{
        String day;
        String time;
        String courseName;
        String code;
    }

    public Search(String searchInput){
        this.searchInput = searchInput;
        //getResults();
    }

    /**
     * Takes in the results of the search and orginzes it to be prepared for the user to see
     * @param searchResults from the getResults method
     */
    public static void orderSearch(ArrayList<Course> searchResults){
        ArrayList<Course> ordered;
    }

    /**
     * Prints the ordered lists from the search results for the user to view and choose what to add.
     * @param orderList takes in and ordered list from the search results given to the orderList()
     */
    public static void printResults(ArrayList<Course> orderList){
        for(int i = 0; i < orderList.size(); i++){
            String course = "";
            course = orderList.get(i).day + " " + orderList.get(i).time + " " + orderList.get(i).code + " " + orderList.get(i).courseName;
            System.out.println(course);
        }

    }
    public static void getResults(String searchInputWithSpace){ //Get rid of static afterwards and return string, get rid of parameter
        try {
            File classFile = new File("theProject/src/classFile.txt");
            Scanner classScan = new Scanner(classFile);
            String course;
            int index = 0;
            String searchInput = searchInputWithSpace.replace(" ", "");
            while (classScan.hasNextLine()) {
                course = classScan.nextLine(); //grabs the line of code (the course info)
                Scanner courseScan = new Scanner(course); //Creates a new scanner to read the line
                courseScan.useDelimiter(",");
                while (courseScan.hasNext()){ //Only search by course code and full course name
                    String data = courseScan.next().replace(" ", "");
                    if(data.equalsIgnoreCase("CourseCode")){
                        break;
                    }
                    if (data.equalsIgnoreCase(searchInput) && index == 0 ||
                            data.toLowerCase().contains(searchInput.toLowerCase()) && index == 0){ //User is searching by course code
                        System.out.println("Match found for: " + searchInput);
                        System.out.println("Here is the course: " + course + "\n");
                        break;
                    }
                    else if (data.equalsIgnoreCase(searchInput) && index == 2){ //User is searching by course name
                        System.out.println("Match found for: " + searchInput);
                        System.out.println("Here is the course: " + course + "\n");
                        break;
                    }
                    index++;
                }
                index = 0;
                courseScan.close();
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
        getResults("abrd");
    }
}