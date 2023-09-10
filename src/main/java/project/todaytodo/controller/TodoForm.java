package project.todaytodo.controller;

public class TodoForm {
    private String text;
    private int preference_point;
    private int importance_point;

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
}
