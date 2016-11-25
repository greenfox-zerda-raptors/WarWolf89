/**
 * Created by almasics on 2016.11.17..
 */
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class App {

    private static Scanner userInput = new Scanner(System.in);
    private static int StringtoId(String s){
        return Integer.parseInt(s)-1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GUI();
            }
        });
//        String input;
//        TaskToDoList tasks = new TaskToDoList();
//        System.out.println("Enter Username: ");
//        String username = userInput.nextLine();
//        tasks.load(username);
//        tasks.Help();
//
//        do {
//            System.out.println("Enter command");
//            input=userInput.nextLine();
//            String[] inputSplit = input.split(" ",2);
//            String command = inputSplit[0];
//            if (command.contentEquals("help")) {
//                tasks.Help();
//            }
//            else if (command.contentEquals("add") || command.contentEquals("a")){
//                tasks.add(inputSplit[1]);
//                System.out.println("new task added: " + inputSplit[1]);
//            }
//
//            else if (command.contentEquals("list")|| command.contentEquals("l")){
//                tasks.list();
//            }
//
//            else if (command.contentEquals("remove") || command.contentEquals("r")) {
//                try {
//                    tasks.remove(StringtoId(inputSplit[1]));
//                } catch (NumberFormatException e) {
//                    System.out.println("Unable to remove: index is not a number");
//                }
//                System.out.printf("task number %s removed \n",inputSplit[1]);
//            }
//            else if (command.contentEquals("complete")|| command.contentEquals("c")){
//                tasks.complete(StringtoId(inputSplit[1]));
//
//            }
//            else {
//                if (input.contentEquals("Exit") || input.contentEquals("e")){
//                break;
//            }
//                System.out.println("not a valid command, would you like to see the help menu? Y / N ");
//                input=userInput.nextLine();
//                if (input.contentEquals("Y")){
//                    tasks.Help();
//                }
//            }
//            tasks.save(username);
//        }
//        while (!input.contentEquals("Exit"));

    }
}


