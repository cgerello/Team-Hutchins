import java.util.Scanner;

public class Main {

    static void printCommands(){
        String[] commands = {"add", "remove", "undo", "redo", "list", "quit"};
        System.out.println("- Valid commands:");
        for(String s : commands){
            System.out.println("\t" + s);
        }
    }


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
                System.out.println("- TODO: login");
            }
           else if(command.equals("sign up")){
                //TODO
                System.out.println("- TODO: sign up");
            }

           else if(command.equals("add")){
                //TODO
                System.out.println("- TODO: add");
            }

            else if(command.equals("remove")){
                //TODO
                System.out.println("- TODO: remove");
            }

            else if(command.equals("undo")){
                //TODO
                System.out.println("- TODO: undo");
            }

            else if(command.equals("redo")){
                //TODO
                System.out.println("- TODO: redo");
            }

            else if(command.equals("list")){
                printCommands();
            }
            //etc

           else {
                System.out.println("- Command not recognized.");
            }


            printScreen();

           //if user is signed in...
            System.out.println("- Type what you'd like to do:");
            System.out.println("  (or 'list' for valid commands)\n");
            command = mainScn.nextLine();
            System.out.println("___________________________________________________\n");
        };

        System.out.println("- Goodbye.\n");

    }
}
