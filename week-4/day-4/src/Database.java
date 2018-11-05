import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class Database implements Persistance {
    private Path path = Paths.get("database.txt");
    Connection myConn;
    Statement myStm;


    public Database() {
        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "Splichus", "123");
            myStm = myConn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Todo> loadAll() {
        List<Todo> todos = new ArrayList<>();
        try {
            ResultSet myRs = myStm.executeQuery("SELECT * from todos");
            while (myRs.next()) {
                todos.add(new Todo(myRs.getInt("todo_id"), myRs.getString("todo_name"), myRs.getString("finished")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return todos;
//        List<Todo> todos = new ArrayList<>();
////        List<String> lines = new ArrayList<>();
////        try {
////            lines = Files.readAllLines(this.path);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        for (int i = 0; i < lines.size(); i++) {
////            String[] split = lines.get(i).split(";");
////            if (split.length > 2) {
////                todos.add(new Todo(Integer.valueOf(split[0]), split[1], LocalDateTime.parse(split[2])));
////            } else {
////                todos.add(new Todo(Integer.valueOf(split[0]), split[1]));
////            }
////        }
////        return todos;
    }

    public Todo loadOne(int id) {
        try {
            ResultSet rs = myStm.executeQuery("SELECT * FROM todos WHERE todo_id=" + id);
            while (rs.next()) {
                return new Todo(rs.getInt("todo_id"), rs.getString("todo_name"), rs.getString("finished"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Todo loadOne(String name) {
        try {
            ResultSet rs = myStm.executeQuery("SELECT * FROM todos WHERE todo_name=" + name);
            while (rs.next()) {
                return new Todo(rs.getInt("todo_id"), rs.getString("todo_name"), rs.getString("finished"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void saveAll(List<Todo> todos) {
        List<String> lines = new ArrayList<>();
        for (Todo todo : todos) {
            lines.add(todo.stringToSave());
        }
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveTodo(Todo todo) {
        List<Todo> todos = loadAll();
        int count = 0;
        for (int i = 0; i < todos.size(); i++) {
            if (todo.getId() == todos.get(i).getId()) {
                todos.set(i, todo);
            } else {
                count++;
            }
        }
        if (count == todos.size()) {
            todos.add(todo);
        }
        saveAll(todos);
    }
}
