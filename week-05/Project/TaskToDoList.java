import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class TaskToDoList {

    ArrayList<Task> tasks = new ArrayList<>();

    public void add(String taskname) {

        if (taskname.contentEquals("")){
            System.out.println("Unable to add, no task given");
        }
        tasks.add(new Task(taskname));

    }

    public void remove(int taskId) {

        tasks.remove(taskId);
    }

    public void complete(int taskId) {
        tasks.get(taskId).setCompleted(true);
    }

    public void list() {
        int elementNumber = 1;
        if (tasks.size()==0) {
            System.out.println("No todo's for today :)");
        }
        for (Iterator<Task> i = tasks.iterator(); i.hasNext(); ) {
            Task item = i.next();
            System.out.print(elementNumber++ + " - ");
            System.out.println(item);
        }
    }
    public void Help() {
        System.out.println("CLI Todo application\n" +
                "====================\n" +
                "\n" +
                "Available commands:\n" +
                " list       Lists all the tasks\n" +
                " l          shorthand for list\n" +
                " add        Adds a new task\n" +
                " a          shorthand for add\n" +
                " remove     Removes an task\n" +
                " r          shorthand for remove\n" +
                " complete   Completes an task\n" +
                " c          shorthand for complete\n" +
                " help       Print out this list again\n" +
                " h          shorthand for help\n" +
                " Exit       Type anytime to Exit the program\n" +
                " e          shorthand for exit\n");
    }
    public void load (){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/almasics/GreenFox/WarWolf89/week-05/Project/save.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            String line = br.readLine();
            while (line != null) {
                System.out.println("This line is read from file:" + line);
                line = br.readLine();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void save() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("C:/Users/almasics/GreenFox/WarWolf89/week-05/Project/save.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            for (Task i: tasks){
                bw.write(i.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
