/**
 * Created by almasics on 2016.11.17..
 */
public class Task {


    public String taskname;
    boolean completed=false;
    int elementNumber;

    public Task(String taskname){
        this.taskname=taskname;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s",completed ? "X": " ",taskname);
    }

    public String getTaskname(){
        return taskname;
    }

    public boolean getCompleted(){
        return completed;
    }

    public void setCompleted(boolean completed){
        this.completed=completed;
    }

}
