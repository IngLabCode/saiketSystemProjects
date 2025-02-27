package com.saiketsystems;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    public List<Task> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found!");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}
