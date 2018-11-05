import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Todos {

    Database database = new Database();

    public String blankArgument () {
        return "Command line todo application\n" +
                "===========================\n" +
                "\n" +
                "Command line arguments: \n" +
                "-l  Lists all new tasks\n" +
                "-a [Task Name] Adds new task\n" +
                "-r [id] Removes a task\n" +
                "-c [id] Completes a task\n"+
                "-u [id] [new todo name] updates the todo\n";
    }
    public void aArgument (String todoName) {
        database.loadAll();
        database.saveTodo(new Todo(todoName));
    }
    public String lArgument() {
        List<Todo> todos = database.loadAll();
        String toReturn = "";
        if (todos.size()==0) {
            toReturn="No todos for today! :)";
        }
        for (int i = 0; i < todos.size(); i++) {
            toReturn+=todos.get(i).toString()+"\n";
        }
        return toReturn;
    }
    public void cArgument(int id) {
        Todo toComplete = database.loadOne(id);
        toComplete.complete();
        database.saveTodo(toComplete);

    }
    public void rArgument(int id) {
        List<Todo> todos = database.loadAll();
        for (int i = 0; i <todos.size() ; i++) {
            if (todos.get(i).getId()==id) {
                todos.remove(i);
                i--;
            }

        }
        database.saveAll(todos);
    }
    public void uArgument (int id, String changedTask) {
        Todo toChange = new Todo(id, changedTask);
        database.saveTodo(toChange);
    }
}
