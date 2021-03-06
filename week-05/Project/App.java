/**
 * Created by almasics on 2016.11.17..
 */
import java.util.*;
public class App {

    static Scanner userInput = new Scanner(System.in);
    public static int StringtoId(String s){
        return Integer.parseInt(s)-1;
    }

    public static void main(String[] args) {
        String input;
        TaskToDoList tasks = new TaskToDoList();
        System.out.println("Enter Username: ");
        String username = userInput.nextLine();
        tasks.load(username);
        tasks.Help();

// This do while loop will be a seperate method one day
        do {
//          sout (enter username)
            System.out.println("Enter command");
            input=userInput.nextLine();
            String[] inputSplit = input.split(" ",2);
            String command = inputSplit[0]; //set to lower case//
            if (command.contentEquals("help")) {
                tasks.Help();
            }
            else if (command.contentEquals("add") || command.contentEquals("a")){
                tasks.add(inputSplit[1]);
                System.out.println("new task added: " + inputSplit[1]);
            }

            else if (command.contentEquals("list")|| command.contentEquals("l")){
                tasks.list();
            }

            else if (command.contentEquals("remove") || command.contentEquals("r")) {
                try {
                    tasks.remove(StringtoId(inputSplit[1]));
                } catch (NumberFormatException e) {
                    System.out.println("Unable to remove: index is not a number");
                }
            }
            else if (command.contentEquals("complete")|| command.contentEquals("c")){
                tasks.complete(StringtoId(inputSplit[1]));

            }
            else {
                if (input.contentEquals("Exit") || input.contentEquals("e")){
                break;
            }
                System.out.println("not a valid command, would you like to see the help menu? Y / N ");
                input=userInput.nextLine();
                if (input.contentEquals("Y")){
                    tasks.Help();
                }
            }
            tasks.save(username);
        }
        while (!input.contentEquals("Exit"));
// will end here
    }





}


