import java.util.Scanner;

public class Main {

    static void printScreen(){
        System.out.println("___________________________________________________");
        System.out.println("Team Hutchins\t\t\tCLASS SCHEDULING ASSISTANT");
        System.out.println("___________________________________________________\n");
    }

    public static void main (String[] args) {
        //CourseList cl = new CourseList();
        //User user = new User("jimatheey123", "mypassword", "Jimatheey");

        Scanner mainScn = new Scanner(System.in);
        printScreen();
        System.out.println("- Welcome to the Class Scheduling Assistant!");
        System.out.println("- Type what you'd like to do:\n");
        System.out.println("login\t\tsign up\t\tquit\n");
        System.out.println("___________________________________________________\n");
        String command = mainScn.nextLine();

        while (!command.equals("quit")){
            if(command.equals("login")){
                //TODO
                System.out.println("TODO: login");
                break;
            }
           else if(command.equals("sign up")){
                //TODO
                System.out.println("TODO: sign up");
                break;
            }
           //etc

            printScreen();
            System.out.println("___________________________________________________\n");
        };

        System.out.println("- Goodbye.\n");

    }
}
