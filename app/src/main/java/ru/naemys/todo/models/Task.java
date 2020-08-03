package ru.naemys.todo.models;

public class Task {

    private String title;
    private boolean complete;

    public Task() {
    }

    public Task(String title, boolean complete) {
        this.title = title;
        this.complete = complete;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
