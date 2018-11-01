import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Todos {

    Database database = new Database();
    List<Todo> todos = new ArrayList<>();

    public Todos() {
        List<String[]> split = new ArrayList<>();
        for (int i = 0; i < database.lines.size() ; i++) {
            split.add(database.lines.get(i).split(";"));
        }
        for (int i = 0; i < split.size() ; i++) {
            if (split.get(i).length>2) {
                todos.add(new Todo(Integer.valueOf(split.get(i)[0]), split.get(i)[1], LocalDateTime.parse(split.get(i)[2])));
            } else {
                todos.add(new Todo(Integer.valueOf(split.get(i)[0]), split.get(i)[1]));
            }
        }
    }


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
        Todo todo = new Todo(todoName);
        database.saveTodo(todo);
    }
    public String lArgument() {
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
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId()==id) {
                todos.get(i).complete();
            }
        }
        database.saveAll(todos);
    }
    public void rArgument(int id) {
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
