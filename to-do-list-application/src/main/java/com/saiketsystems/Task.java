package com.saiketsystems;

public class Task {
    public String title;
    public String status;

    public Task(String title) {
        this.title = title;
        this.status = "Incomplete!";
    }

    @Override
    public String toString() {
        return "Task: " + title + " Status: " + status;
    }

    public void markComplete() {
        this.status = "Completed!";
    }

    public String getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

}
