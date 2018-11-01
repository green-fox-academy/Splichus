import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Database {
    Path path;
    List<String> lines;

    public Database() {
        this.path = Paths.get("database.txt");
        lines = loadAll();
    }
    public List<String> loadAll () {
        List<String> loadedlines = new ArrayList<>();
        try {
            loadedlines = Files.readAllLines(this.path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loadedlines;
    }
    public 
    public void saveAll(List<Todo> todos) {
        lines.clear();
        for (Todo todo : todos) lines.add(todo.stringToSave());
        save();

    }
    public void saveTodo(Todo todo) {
        List<String[]> split = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            split.add(lines.get(i).split(";"));
        }
        List<Todo> helper = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < split.size() ; i++) {
            if (split.get(i).length > 2) {
                helper.add(new Todo(Integer.valueOf(split.get(i)[0]), split.get(i)[1], LocalDateTime.parse(split.get(i)[2])));
            } else {
                helper.add(new Todo(Integer.valueOf(split.get(i)[0]), split.get(i)[1]));
            }
            if (todo.getId() == helper.get(i).getId()) {
                helper.get(i).setName(todo.getName());
                lines.set(i, helper.get(i).stringToSave());
            } else {
                count++;
            }
        }
        if (count == split.size()) {
            lines.add(todo.stringToSave());
        }
        save();
    }
    private void save() {
        try {
            Files.write(path,lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
