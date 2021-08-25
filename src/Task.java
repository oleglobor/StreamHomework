import java.util.List; //
public class Task implements Comparable<Task>{
    private String title;
    private String creationDate;
    private Type type;
    private List<String> tags;

    public Task(String title, String creationDate, Type type, List<String> tags) {
        this.title = title;
        this.creationDate = creationDate;
        this.type = type;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", type=" + type +
                ", tags=" + tags +
                '}';
    }

    @Override
    public int compareTo(Task o) {
        return creationDate.compareTo(o.getCreationDate());
    }
}