import java.util.List;

public interface Persistance {

    public List<Todo> loadAll ();
    public Todo loadOne(int id);
    public Todo loadOne(String name);
    public void saveAll(List<Todo> todos);
    public void saveTodo(Todo todo);

}
