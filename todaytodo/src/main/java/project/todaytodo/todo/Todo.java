package project.todaytodo.todo;

public class Todo {



    private Long id;
    //private Long date;
    private String text;
    private int preference_point;
    private int importance_point;
    private boolean done;

    public Todo(Long id, String text, int preference_point, int importance_point, boolean done) {
        this.id = id;
        //this.date = date;
        this.text = text;
        this.preference_point = preference_point;
        this.importance_point = importance_point;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
*/
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPreference_point() {
        return preference_point;
    }

    public void setPreference_point(int preference_point) {
        this.preference_point = preference_point;
    }

    public int getImportance_point() {
        return importance_point;
    }

    public void setImportance_point(int importance_point) {
        this.importance_point = importance_point;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", preference_point=" + preference_point +
                ", importance_point=" + importance_point +
                ", done=" + done +
                '}';
    }
}
