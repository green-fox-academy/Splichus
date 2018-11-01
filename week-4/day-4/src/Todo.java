import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Todo {
    private static int ID = 0;
    private int id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;

    public Todo(String name) {
        ID++;
        this.id=ID;
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public Todo(int id, String name, LocalDateTime completedAt) {
        if (id > ID) ID = id;
        this.id = id;
        this.name = name;
        this.completedAt = completedAt;
    }

    public Todo(int id, String name) {
        if (id > ID) ID = id;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        if (isCompleted()) {
            return id+" [x] "+name+"- completed in "+ completionTime(completedAt, LocalDateTime.now()).toString();
        }
        return id+" [ ] "+name;
    }

    private String completionTime(LocalDateTime from, LocalDateTime to) {

        LocalDateTime temp = LocalDateTime.from(from);
        long years = temp.until(to, ChronoUnit.YEARS);
        temp = temp.plusYears(years);

        long months = temp.until(to, ChronoUnit.MONTHS);
        temp = temp.plusMonths(months);

        long days = temp.until(to, ChronoUnit.DAYS);
        temp = temp.plusDays(days);

        long hours = temp.until(to, ChronoUnit.HOURS);
        temp = temp.plusHours(hours);

        long minutes = temp.until(to, ChronoUnit.MINUTES);
        temp = temp.plusMinutes(minutes);

        long seconds = temp.until(to, ChronoUnit.SECONDS);
        temp = temp.plusSeconds(seconds);

        return days+" days, "+hours+" hours, "+minutes+" minutes and "+seconds+" seconds.";
    }

    public void complete() {
        completedAt=LocalDateTime.now();
    }
    public boolean isCompleted(){
        if (completedAt != null) return true;
        return false;
    }

    public String stringToSave() {
        if (getCompletedAt() != null) {
            return id+";"+name+";"+completedAt.toString();
        } else
            return id+";"+name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setName(String name) {
        this.name = name;
    }


}
